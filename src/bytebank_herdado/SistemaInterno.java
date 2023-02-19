package bytebank_herdado;

public class SistemaInterno {

private int senha = 123;
	

	public void autenticacao(Autenticavel x) {
		boolean autenticador = x.autentica(this.senha);
		if(autenticador) {
			System.out.println("Pode entrar no sistema");
		} else {
			System.out.println("não pode entrar no sistema");
		}
	}
	
}
