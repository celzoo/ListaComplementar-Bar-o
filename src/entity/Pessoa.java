package entity;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	
	private void  emagrece(double menos) {
		this.peso = peso-menos;
	}
	private void  ganha(double ganha) {
		this.peso = peso+ganha;
	}
	private void  envelhecer(int menos) {
		
		if(menos<21) {
			double nova = altura +0.5;
		crescer(nova);
		}
		this.idade = menos;
	}
	public void crescer(double altura) {
		this.altura = altura;
	}
	
	
	
	
}
