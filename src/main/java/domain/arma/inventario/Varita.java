package domain.arma.inventario;

import domain.arma.Arma;
import domain.heroe.Heroe;

// Inmutable
public class Varita implements Arma {
	@Override
	public int puntosDeDanio() {
		return 5;
	}

	@Override
	public void inflingirDanioA(Heroe heroe, Heroe rival) {
		rival.recibirDanio(heroe.puntosDeAtaque());
	}
}
