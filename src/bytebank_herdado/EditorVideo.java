package bytebank_herdado;

public class EditorVideo extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do EDITOR DE VIDEO");
		return 150;
	}
}
