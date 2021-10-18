package generico;

public class CaixaIntTeste {
	
	public static void main(String[] args) {
		
		CaixaInt caixaA = new CaixaInt();
		
		caixaA.guardar(15);
		
		Integer coisaA = caixaA.abrir(); 
		
		System.out.println(coisaA);
	}

}
