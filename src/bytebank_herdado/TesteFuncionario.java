package bytebank_herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente funcionario = new Gerente();
		funcionario.setNome("Vitor");
		funcionario.setCpf("123.456.789-65");
		funcionario.setSalario(2600.0);
		
		System.out.println(funcionario.getBonificacao());
	}
}
