package domain.arma;

import domain.heroe.Heroe;

public interface Arma {
	int puntosDeDanio();
	void inflingirDanioA(Heroe rival, int puntosAtaqueHeroe);
}
