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
		// Dado que un heroe puede no estar equipado con un arma
		// hacemos el check por null para saber si posee una, pues
		// en esta versión decidimos modelar a la "ausencia" de arma con null
		// Notar como esta opción nos obliga a tener un if-else y además
		// a repetir código de validación de energía similar al método recibirDanio()
		if (arma != null) {
			// Los heroes delegan en sus armas el inflingir daño a su oponente (usamos composición + delegación)
			arma.inflingirDanioA(this, rival);
		} else {
			// Para poder utilizar esta solución tuvimos que modificar
			// el método puntosDeAtaque() de los heroes (revisarlos)
			rival.recibirDanio(this.puntosDeAtaque() + 2);
			int energiaRestante = energia - 1;
			energia = energiaRestante >= 0 ? energiaRestante : 0;
		}
	}

	public abstract int puntosDeAtaque();

	public void recibirDanio(int danio) {
		int energiaRestante = energia - danio;
		energia = energiaRestante >= 0 ? energiaRestante : 0;
	}
}
