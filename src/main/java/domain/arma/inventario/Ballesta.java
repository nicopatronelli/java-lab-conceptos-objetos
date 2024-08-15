package domain.arma.inventario;

import domain.arma.Arma;
import domain.heroe.Heroe;

public class Ballesta implements Arma {
	private int saetas;
	private final boolean esDeLargaDistancia;

	public Ballesta(int cantidadSaetas, boolean esDeLargaDistancia) {
		this.saetas = cantidadSaetas;
		this.esDeLargaDistancia = esDeLargaDistancia;
	}

	@Override
	public int puntosDeDanio() {
		return 20 + (esDeLargaDistancia ? 10 : 0);
	}

	@Override
	public void inflingirDanioA(Heroe heroe, Heroe rival) {
		if (saetas > 0) {
			rival.recibirDanio(heroe.puntosDeAtaque());
			saetas--;
		}
	}
}
