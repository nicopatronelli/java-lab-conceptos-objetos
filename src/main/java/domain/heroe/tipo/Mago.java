package domain.heroe.tipo;

import java.util.Random;

import domain.arma.inventario.Varita;
import domain.heroe.Heroe;

public class Mago extends Heroe {
	private static final Random NUMERO_ALEATORIO = new Random();

	public Mago() {
		super(new Varita());
	}

	@Override
	public int puntosDeAtaque() {
		return 0;
	}

	@Override
	public void recibirDanio(int danio) {
		super.recibirDanio(danio);
		//if (NUMERO_ALEATORIO.nextInt(2) == 1){
		energia += 5;
		//}
	}
}
