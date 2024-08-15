package domain.arma.inventario;

import domain.arma.Arma;
import domain.heroe.Heroe;

// Las instancias de Espada son inmutables porque una vez construidos
// los objetos no pueden cambiar su estado (conformado solamente
// por su atributo de instancia filo)
public class Espada implements Arma {
	private final int filo;

	public Espada(int filo) {
		this.filo = filo;
	}

	@Override
	public int puntosDeDanio() {
		return filo * 2;
	}

	@Override
	public void inflingirDanioA(Heroe heroe, Heroe rival) {
		rival.recibirDanio(heroe.puntosDeAtaque());
	}
}
