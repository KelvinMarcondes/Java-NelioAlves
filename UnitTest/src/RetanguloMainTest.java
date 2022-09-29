
public class RetanguloMainTest {

	public static void main(String[] args) {
		RetanguloTest test = new RetanguloTest();
		boolean resultado;
		
		resultado = test.testCalcularArea();
		System.out.println("Resultado calcular area: " + resultado);
		
		resultado = test.testCalcularPerimetro();
		System.out.println("Resultado calcular perimetro: " + resultado);

	}
}
