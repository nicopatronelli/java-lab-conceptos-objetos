package domain.heroe.tipo;

import domain.arma.Arma;
import domain.heroe.Heroe;

public class Cazador extends Heroe {
	public Cazador(Arma armaSeleccionada) {
		super(armaSeleccionada);
	}

	@Override
	public int puntosDeAtaque() {
		return this.arma.puntosDeDanio() / 2;
	}
}
