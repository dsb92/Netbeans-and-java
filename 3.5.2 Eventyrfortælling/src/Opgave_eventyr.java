import java.util.*;

public class Opgave_eventyr
{
	public static void main(String[] arg)
	{
		System.out.println("Der var engang...");
            
            
                ArrayList<String> dyr = new ArrayList<String>(); // liste af strenge
		dyr.add("en tyk gris");
                dyr.add("en bange gris");
                dyr.add("en modig gris");
		
                ArrayList<String> personer = new ArrayList<String>();
                personer.add("Rødhætte");
                
                ArrayList<String> ondt_dyr = new ArrayList<String>();
                ondt_dyr.add("Ulven");
                
	 
                //handling for grisene
                
                ArrayList<String> handlinger = new ArrayList<String>(); 
                
                handlinger.add("som fik en idé!");
                handlinger.add("som gemte sig i et hus lavet af hø");
                handlinger.add("som gemte sig i et hus lavet af træ");
                handlinger.add("som gemte sig i et hus lavet af mursten");
        
                //handling for Rødhætte
                
                ArrayList<String> handlinger_2 = new ArrayList<String>();
		handlinger_2.add("fik en idé!");
		handlinger_2.add("gemte sig i skoven");
                
                // handling for Ulven
                
                ArrayList<String> handlinger_3 = new ArrayList<String>();
                handlinger_3.add("fik en idé");
                handlinger_3.add("slikkede sig om munden");
                handlinger_3.add("fulgte efter grisene");
                
 
		for (int i=0; i<3; i++) 
                
         // listen af de tre små griser og handlingerne kombineret
                    
                {
			int dyrNummer = (int) (Math.random()*dyr.size());
              
              String grise = dyr.get( dyrNummer );
              String handling = handlinger.get( (int)(Math.random()*handlinger.size()));			
                        
			System.out.println(grise + " " + handling);
                }
              
             
         //listen af rødhætte og handlingerne_2 kombineret
                
                for (int o=0; o<2; o++)
                    
                {
                    int personNummer = (int) (Math.random()*personer.size());
                    String rødhætte = personer.get( personNummer );
                    String handling2 = handlinger_2.get( (int)(Math.random()*handlinger_2.size()));
                    
                    System.out.println(rødhætte + " " + handling2);
                    
                }
                
        //listen af Ulven og handlingerne_3 kombineret
                
                for (int p=0; p<3; p++)
                    
                {
                    int ondt_dyrNummer = (int) (Math.random()*ondt_dyr.size());
                    String ulven = ondt_dyr.get( ondt_dyrNummer );
                    String handling3 = handlinger_3.get( (int)(Math.random()*handlinger_3.size()));
                    
                    System.out.println(ulven + " " + handling3);
                    
                }
                
                for (String element : dyr)
                    System.out.println("De gode i historien er: " + element);
                for (String element : personer)
                    System.out.println("Personer i historien er: " + element);
                for (String element : ondt_dyr)
                    System.out.println("Det onde i historien er: " + element);
                
                
  }
}