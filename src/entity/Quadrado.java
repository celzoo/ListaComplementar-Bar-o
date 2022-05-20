package entity;

public class Quadrado {
	private double valorLado;
	
	public void mudarValorLado(double valorLado) {
		this.valorLado = valorLado;
		
	}
	public  double retornarValorDoLado() {
		return valorLado;
		
	}
	public double calcularArea() {
		
		return valorLado*valorLado;
		
		
	}

}
