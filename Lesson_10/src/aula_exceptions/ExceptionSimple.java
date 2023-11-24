package aula_exceptions;

public class ExceptionSimple extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ExceptionSimple() {
	
	}
	
	public ExceptionSimple(String message) {
		super(message);
	}

}
