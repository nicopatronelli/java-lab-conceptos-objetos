package domain.arma.inventario;

import domain.arma.Arma;
import domain.heroe.Heroe;

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
	public void inflingirDanioA(Heroe rival, int puntosAtaqueHeroe) {
		rival.recibirDanio(puntosAtaqueHeroe);
	}
}
