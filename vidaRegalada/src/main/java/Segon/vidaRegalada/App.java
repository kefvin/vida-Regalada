package Segon.vidaRegalada;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static final int NOMBRECASELLES = 10;
	private static final int NOMBRECAVALLERS = 6;
	private static final String[] obstacles = { "Bandit", "Res", "Fera", "Res", "Trampa"};
	
    public static void main( String[] args )
    {
    	Random rand = new Random();
    	
    	List<Casella> caselles = new ArrayList();
    	List<Cavaller> cavallers = new ArrayList();
    	
    	for(int i = 0; i<NOMBRECASELLES; i++){
    		caselles.add(new Casella(obstacles[rand.nextInt(4)]));
    	}
    	
    	for(int i = 0; i<NOMBRECAVALLERS;i++){
    		cavallers.add(new Cavaller("Cavaller"+i));
    	}
    	
    	Run run = new Run();
    	run.corre(cavallers, caselles);
        
    }
}
