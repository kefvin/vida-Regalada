package Segon.vidaRegalada;

import java.util.List;
import java.util.Random;

public class Run {
	Random rand = new Random();
	
	public void corre(List<Cavaller> cavallers, List<Casella> caselles){
		
		boolean fi = true;
		Cavaller vell = new Cavaller();
		
		while(fi){
			
			for(int i = cavallers.size(); i<0; i--){
				int dau = rand.nextInt(3)+1;
				int taulell = caselles.size()-1;
				
				Cavaller cavaller = cavallers.get(i);
				
				Casella casellaVella = caselles.get(cavaller.getPosicio()); 
				
				cavaller.setPosicio(dau, taulell);
				int posicioCavaller = cavaller.getPosicio();
				Casella casella = caselles.get(posicioCavaller);
				Cavaller enemic = casella.getCavaller();
				String obstacle = casella.getObstacle();
				
				comprovarObstacle(obstacle, cavaller, cavallers, casella, taulell, casellaVella);
				lluitaCavaller(cavaller, enemic, cavallers, casella, casellaVella);
				
				if(posicioCavaller == taulell){
					fi = false;
					System.out.println("¡¡¡El cavaller "+cavaller+" ha guanyat!!!");
					break;
				}else if(cavallers.size()==0){
					fi = false;
					System.out.println("Tots els cavallers han mort....");
					break;
				}
				
				vell = cavaller;
			}
		}
	}

	private void lluitaCavaller(Cavaller cavaller, Cavaller enemic, List<Cavaller> cavallers, Casella casella,
			Casella casellaVella) {
		
		if(rand.nextInt(100)>50){
			cavallers.remove(enemic);
			casellaVella.removeCavaller();
			casella.setCavaller(cavaller);
		}else{
			cavallers.remove(cavaller);
		}
		
	}

	private void comprovarObstacle(String obstacle, Cavaller cavaller, List<Cavaller> cavallers,
			 Casella casella, int taulell, Casella casellaVella) {

		switch(obstacle){
		case "Bandit":
			if(rand.nextInt(100)>25){
				casellaVella.removeCavaller();
				casella.setCavaller(cavaller);
			}else{
				casellaVella.removeCavaller();
				cavallers.remove(cavaller);
				System.out.println("El cavaller "+cavaller+" ha mort per un bandit.");
			}
			break;
		case "Fera":
			cavaller.setPosicio(cavaller.getPosicio()-5, taulell);
			casellaVella.removeCavaller();
			casella.setCavaller(cavaller);
			System.out.println("El cavaller "+cavaller+" recula per una fera.");
			break;
		case "Trampa":
			casellaVella.removeCavaller();
				cavallers.remove(cavaller);
				System.out.println("El cavaller "+cavaller+" ha mort per una trampa.");
			break;
		}
		
	}

}
