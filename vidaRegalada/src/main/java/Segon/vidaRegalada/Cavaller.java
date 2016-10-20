package Segon.vidaRegalada;

public class Cavaller {
	
	String nom;
	int posicio = 0;
	
	public Cavaller(){
		
	}
	
	public Cavaller(String a){
		nom = a;
	}
	
	public String getNom(){
		return nom;
	}
	
	public int getPosicio(){
		return posicio;
	}
	
	public void setPosicio(int a, int max){
		posicio += a;
		if(posicio>max){
			posicio=max;
		}else if(posicio<0){
			posicio = 0;
		}
	}
}
