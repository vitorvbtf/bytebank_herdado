package bytebank_herdado;

public class TesteGerente {

	public static void main(String[] args) {
		
	   Autenticavel referencia = new Gerente();
	   referencia.setSenha(134);
	   
		
	   Gerente gerente = new Gerente();	
	   gerente.setNome("Marco");
	   gerente.setCpf("125.489.325-59");
	   gerente.setSalario(5000.0);
	   gerente.setSenha(12345);
	   
	   boolean autenticou = gerente.autentica(12345);
	   System.out.println(autenticou);
	   
	   System.out.println(gerente.getBonificacao());
	}
}
