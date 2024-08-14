package domain.heroe;

import domain.arma.Arma;

public abstract class Heroe {
	protected int energia;
	protected Arma arma;

	public Heroe(Arma armaSeleccionada) {
		this.energia = 100;
		this.arma = armaSeleccionada;
	}

	// Necesario para tests
	public int energia() {
		return energia;
	}

	public void pelearCon(Heroe rival) {
		arma.inflingirDanioA(this, rival, this.puntosDeAtaque());
	}

	protected abstract int puntosDeAtaque();

	public void recibirDanio(int danio) {
		int energiaRestante = energia - danio;
		if (energiaRestante >= 0) {
			energia = energiaRestante;
		} else {
			energia = 0;
		}
	}
}
