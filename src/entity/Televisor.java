package entity;

public class Televisor {
	private int volume;
	private int canal;
	
	public void aumentarVolume() {
		if(volume<10) {
			volume++;
		}
		else {
			System.out.println("Volume maximo");
		}
		
	}
	public void abaixaVolume() {
		if(volume>0) {
			volume--;
		}
		else {
			System.out.println("ja esta sem som");
		}
		
	}
	
	public void mudaCanal(int canal) {
		this.canal = canal;
		
	}
	public Televisor(int volume) {
		super();
		this.volume = volume;
		
	}
	
	
	

}
