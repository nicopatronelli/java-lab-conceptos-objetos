package domain.arma.inventario;

import domain.arma.Arma;
import domain.heroe.Heroe;

// Las instancias de Varita son objetos stateless, es decir,
// que no poseen estado (notar que no poseen ningún atributo de instancia)
// y, por definición, son inmutables
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
