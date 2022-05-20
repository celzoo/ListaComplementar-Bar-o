package View;

import entity.Televisor;

public class Televisao {

	public static void main(String[] args) {
		Televisor televisao = new Televisor(0);
		
		televisao.aumentarVolume();
		televisao.abaixaVolume();
		televisao.mudaCanal(100);
	}

}
