package domain.heroe.excepcion;

public class FuerzaInicialInsuficienteException extends RuntimeException {
	public FuerzaInicialInsuficienteException(String mensajeError) {
		super(mensajeError);
	}
}
