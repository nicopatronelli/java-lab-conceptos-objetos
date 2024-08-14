package domain.arma.inventario;

import domain.arma.Arma;
import domain.heroe.Heroe;

public class Ballesta implements Arma {
	private int saetas;
	private final boolean esDeLargaDistancia;

	public Ballesta(int cantidadSaetas, boolean esDeLargaDistancia) {
		this.esDeLargaDistancia = esDeLargaDistancia;
		this.saetas = cantidadSaetas;
	}

	@Override
	public int puntosDeDanio() {
		return 20 + (esDeLargaDistancia ? 10 : 0);
	}

	@Override
	public void inflingirDanioA(Heroe rival, int puntosAtaqueHeroe) {
		if (saetas > 0) {
			rival.recibirDanio(puntosAtaqueHeroe);
			saetas--;
		}
	}
}
