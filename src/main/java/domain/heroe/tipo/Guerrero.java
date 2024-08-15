package domain.heroe.tipo;

import domain.arma.Arma;
import domain.heroe.Heroe;
import domain.heroe.excepcion.FuerzaInicialInsuficienteException;

public class Guerrero extends Heroe {
	private int fuerza;

	public Guerrero(Arma arma, int fuerzaInicial) {
		super(arma);
		if (fuerzaInicial < 10) {
			throw new FuerzaInicialInsuficienteException("La fuerza inicial deber ser igual o mayor a 10.");
		}
		this.fuerza = fuerzaInicial;
	}

	@Override
	public void pelearCon(Heroe rival) {
		super.pelearCon(rival);
		int fuerzaRestante = fuerza - 10;
		fuerza = fuerzaRestante > 0 ? fuerzaRestante : 0;
	}

	@Override
	public int puntosDeAtaque() {
		// Dado que modelamos el pelear con los puños usando null
		// tenemos que chequear que el arma no sea null antes de
		// enviarle el mensaje puntosDeDanio, sino podríamos
		// obtener una NullPointerException
		return fuerza + (this.arma != null ? this.arma.puntosDeDanio() : 0);
	}
}
