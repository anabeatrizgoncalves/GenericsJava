package generico;

public class CaixaNumeroTeste {
	
	public static void main(String[] args) {
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(123.0);
		System.out.println(caixaA.abrir());
		
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guardar(123);
		System.out.println(caixaB.abrir());
		
	}

}
