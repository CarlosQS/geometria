
/**
 * Clase Triangulo
 * @author Carlos Quiles Serrano
 * @version 1.2
 */

public class Triangulo_CQS extends FiguraGeometrica_CQS {
	private double lado1;
	private double lado2;
	private double lado3;
	
	/**
	 * Constructor Triangulo
	 * @param tipoFigura Nombre
	 * @param lado1 Lado 1
	 * @param lado2 Lado 2
	 * @param lado3 Lado 3
	 */
	
	public Triangulo_CQS(String tipoFigura, double lado1, double lado2, double lado3) {
		super(tipoFigura);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	/**
	 * Cálculo de Perímetro
	 */
	
	@Override
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}

	/**
	 * Cálculo de Area
	 */
	
	@Override
	public double area() { //Utiliza la formula de Her—n
		double sp;
		sp = this.semiPerimetro();
		return Math.sqrt(sp * (sp-lado1) * (sp-lado2) * (sp-lado3));
	}
}
