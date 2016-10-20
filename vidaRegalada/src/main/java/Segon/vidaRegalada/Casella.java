package Segon.vidaRegalada;

public class Casella {
	
	String obstacle;
	Cavaller cavaller = null;
	
	public Casella(String o){
		obstacle = o;
	}
	
	public String getObstacle(){
		return obstacle;
	}
	
	public Cavaller getCavaller(){
		return cavaller;
	}
	
	public void setCavaller(Cavaller c){
		cavaller = c;
	}
	
	public void removeCavaller(){
		cavaller = null;
	}
}
