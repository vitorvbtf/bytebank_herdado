package bytebank_herdado;

public class Cliente implements Autenticavel {

	private ControleAuteticacao autenticador;

	public Cliente() {
		this.autenticador = new ControleAuteticacao();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
