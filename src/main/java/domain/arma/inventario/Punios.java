package domain.arma.inventario;

import domain.arma.Arma;
import domain.heroe.Heroe;

// Inmutable
public class Punios implements Arma {
	@Override
	public int puntosDeDanio() {
		return 2;
	}

	@Override
	public void inflingirDanioA(Heroe heroe, Heroe rival, int puntosAtaqueHeroe) {
		rival.recibirDanio(puntosAtaqueHeroe);
		heroe.recibirDanio(1);
	}
}
