package entity;

public class Retangulo {
	private double base;
	private double  altura;
	
	
	
	public Retangulo(double altura2, double base2) {
		
		this.base = altura2;
		this.altura = base2;
	}
	public void mudarValorDosLados(double base , double altura) {
		this.altura = altura;
		this.base = base;
		
		
	}
	public String retornarValorDosLados() {
		
		return "" + base + "" + altura;
		
	}
	public double calcularArea() {
		
		return (base*altura)/2;
		
		
	}
	public double calcularPerimetro() {
		
		return 2*(base+altura);
		
		
	}
	
	
	
}
