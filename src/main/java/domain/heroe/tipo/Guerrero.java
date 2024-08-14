package domain.heroe.tipo;

import domain.arma.Arma;
import domain.heroe.Heroe;

public class Guerrero extends Heroe {
	private int fuerza;

	public Guerrero(Arma arma, int fuerza) {
		super(arma);
		this.fuerza = fuerza;
	}

	@Override
	public void pelearCon(Heroe rival) {
		super.pelearCon(rival);
		int fuerzaRestante = fuerza - 10;
		fuerza = fuerzaRestante > 0 ? fuerzaRestante : 0;
	}

	@Override
	public int puntosDeAtaque() {
		return fuerza + arma.puntosDeDanio();
	}
}
