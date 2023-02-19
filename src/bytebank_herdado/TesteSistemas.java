package bytebank_herdado;

public class TesteSistemas {
	public static void main(String[] args) {
		
	Gerente g =  new Gerente();
	g.setSenha(123);
	
	Cliente c =  new Cliente();
	c.setSenha(123);
	
    Administrador a =  new Administrador();
	a.setSenha(1234);
	
	
	
	SistemaInterno si = new SistemaInterno();
	si.autenticacao(a);
	si.autenticacao(c);
	si.autenticacao(g);
  }
}
