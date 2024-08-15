package domain.arma.inventario;

import domain.arma.Arma;
import domain.heroe.Heroe;

// Inmutable
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
