package bytebank_herdado;

public class EditorVideo extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do EDITOR DE VIDEO");
		return 150;
	}
}
