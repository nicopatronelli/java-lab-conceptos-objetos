package domain;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

import domain.arma.Arma;
import domain.arma.inventario.Ballesta;
import domain.arma.inventario.Espada;
import domain.arma.inventario.Punios;
import domain.heroe.excepcion.FuerzaInicialInsuficienteException;
import domain.heroe.tipo.Cazador;
import domain.heroe.tipo.Guerrero;
import domain.heroe.Heroe;
import domain.heroe.tipo.Mago;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HeroesTest {
    @Test
    void unGuerreroPeleaContraUnMagoUsandoUnaEspada() {
        Espada excalibur = new Espada(5);
        Heroe guerrero = new Guerrero(excalibur, 10);
        Heroe mago = new Mago();

        guerrero.pelearCon(mago);

        assertEquals(100, guerrero.energia());
        assertEquals(85, mago.energia());
    }

    @Test
    void unaBallestaSoloPuedeUtilizarseEnTresAtaques() {
        Arma excalibur = new Espada(5);
        Arma ballesta = new Ballesta(3, true);

        Heroe cazador = new Cazador(ballesta);
        Heroe guerrero = new Guerrero(excalibur, 10);

        cazador.pelearCon(guerrero);
        cazador.pelearCon(guerrero);
        cazador.pelearCon(guerrero);

        assertEquals(55, guerrero.energia());

        cazador.pelearCon(guerrero);
        assertEquals(55, guerrero.energia());
    }

    @Test
    void unHeroeSinNingunaArmaEquipadaPeleaUsandoSusPunios() {
        Heroe guerreroSinArma = new Guerrero(new Punios(), 10);

        Arma ballesta = new Ballesta(3, true);
        Heroe rival = new Cazador(ballesta);

        IntStream.rangeClosed(1, 5).forEach(i -> guerreroSinArma.pelearCon(rival));

        assertEquals(80, rival.energia());
        assertEquals(95, guerreroSinArma.energia());
    }

    @Test
    void unGuerreroNoPuedeCrearseConUnaFuerzaInicialMenorA10() {
        assertThrows(
                FuerzaInicialInsuficienteException.class,
                () -> new Guerrero(new Punios(), 5));
    }
}
