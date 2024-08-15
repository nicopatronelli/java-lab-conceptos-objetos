package domain.arma.inventario;

import domain.arma.Arma;
import domain.heroe.Heroe;

// Utilizamos el patrón de diseño Null Object Pattern que
// permite representar la ausencia de un valor utilizando un
// objeto de dominio en lugar de null (que tiene todos los
// problemas que ya revisamos).

// Notar que los objetos de tipo Punios son polimorficos
// con cualquier otro tipo de Arma, evitando tener que
// utilizar los checks por arma == null y tener lógica repetida,
// alcanzado una solución que es mucho más fiel al paradigma de objetos
// (básicamente reemplazamos if por polimorfismo)
public class Punios implements Arma {
	@Override
	public int puntosDeDanio() {
		return 2;
	}

	@Override
	public void inflingirDanioA(Heroe heroe, Heroe rival) {
		rival.recibirDanio(heroe.puntosDeAtaque());
		heroe.recibirDanio(1);
	}
}

