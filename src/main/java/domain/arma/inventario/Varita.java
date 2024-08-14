package domain.arma.inventario;

import domain.arma.Arma;
import domain.heroe.Heroe;

public class Varita implements Arma {
	@Override
	public int puntosDeDanio() {
		return 5;
	}

	@Override
	public void inflingirDanioA(Heroe rival, int puntosAtaqueHeroe) {
		rival.recibirDanio(puntosAtaqueHeroe);
	}
}
