package domain.heroe.tipo;

import domain.arma.Arma;
import domain.heroe.Heroe;

public class Cazador extends Heroe {
	public Cazador(Arma armaSeleccionada) {
		super(armaSeleccionada);
	}

	@Override
	public int puntosDeAtaque() {
		// Dado que modelamos el pelear con los puños usando null
		// tenemos que chequear que el arma no sea null antes de
		// enviarle el mensaje puntosDeDanio, sino podríamos
		// obtener una NullPointerException
		return this.arma != null ? this.arma.puntosDeDanio() / 2 : 0;
	}
}
