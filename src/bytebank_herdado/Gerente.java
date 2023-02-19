package bytebank_herdado;

public class Gerente extends Funcionario implements Autenticavel {

	private ControleAuteticacao autenticador;

	public Gerente() {
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

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getSalario();
	}
}
