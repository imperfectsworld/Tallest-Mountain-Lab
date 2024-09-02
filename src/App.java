import co.grandcircus.co.grandcircus.Mesa;
import co.grandcircus.co.grandcircus.Mountain;
import co.grandcircus.co.grandcircus.iFormation;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<iFormation> formations = new ArrayList<>();

        Mountain mtFuji = new Mountain(3776, "Mt.Fuji");
        Mountain mtK2 = new Mountain(8611, "K2");
        Mountain mtManaslu = new Mountain(8163, "Manaslu");
        Mountain mtEverest = new Mountain(8848, "Everest");

        Mesa grandMesa = new Mesa(10000, "Grand Mesa", 500);
        Mesa verdeMesa = new Mesa(8500, "Mesa Verde", 81);
        Mesa cedarMesa = new Mesa(6500, "Cedar Mesa", 400);
        Mesa pariMesa = new Mesa(6100, "Paria Plateau", 1300);

        formations.add(pariMesa);
        formations.add(cedarMesa);
        formations.add(verdeMesa);
        formations.add(grandMesa);

        formations.add(mtEverest);
        formations.add(mtFuji);
        formations.add(mtK2);
        formations.add(mtManaslu);

        
        showInfo(formations);
        System.out.println(String.format("\n\nThe tallest is : %s",findTallest(formations).getInfo()));
        System.out.println(String.format("\nThe tallest Mountain is : %s",findTallestMountain(formations).getInfo()));
        System.out.println(String.format("\nThe tallest Mesa is : %s",findTallestMesa(formations).getInfo()));
        
      



    }

    public static void showInfo(ArrayList<iFormation> formations)
    {
        for(int i = 0; i < formations.size(); i++)
        {
            System.out.println(formations.get(i).getInfo());
            
        }
    }

    public static iFormation findTallest(ArrayList<iFormation> formations)
    {
        int most = formations.get(0).getHeight();
        iFormation tallest = formations.get(0);
        for(int i = 0; i < formations.size(); i++)
        {
            if(formations.get(i).getHeight() > most )
            {
              most = formations.get(i).getHeight();
              tallest = formations.get(i);
              
            }
            else 
            {
                continue;
            }
            
        }
        
        return tallest;
    }

    //extra credit {Mountain only}
    public static iFormation findTallestMountain(ArrayList<iFormation> formations)
    {
        int most = formations.get(0).getHeight();
        iFormation mtallest = formations.get(0);
        for(int i = 0; i < formations.size(); i++)
        {
            if(formations.get(i) instanceof Mountain)
            {
            if(formations.get(i).getHeight() > most )
            {
              most = formations.get(i).getHeight();
              mtallest = formations.get(i);
              
            }
            else 
            {
                continue;
            }
        }
        }
        
        return mtallest;
    }

    //extra credit {Mesa only}
    public static iFormation findTallestMesa(ArrayList<iFormation> formations)
    {
        int most = formations.get(0).getHeight();
        iFormation mestallest = formations.get(0);
        for(int i = 0; i < formations.size(); i++)
        {
            if(formations.get(i) instanceof Mesa)
            {
            if(formations.get(i).getHeight() > most )
            {
              most = formations.get(i).getHeight();
              mestallest = formations.get(i);
              
            }
            else 
            {
                continue;
            }
        }
        }
        
        return mestallest;
    }








}

