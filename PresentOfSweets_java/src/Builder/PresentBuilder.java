package Builder;

import Sweets.CandySweet;
import Sweets.ChocoSweet;
import Sweets.Sweet;
import Sweets.nameOfSweets;

import java.util.ArrayList;
import java.util.List;

public class PresentBuilder {

    public static Present createPresent() {

        CandySweet ledenets = new CandySweet (nameOfSweets.NAME1,20, 80, 12, "apple", "oval");
        ChocoSweet milka = new ChocoSweet(nameOfSweets.NAME2,150, 780, 70,"milk", "Mondelez");
        CandySweet chupa_chups = new CandySweet(nameOfSweets.NAME3,60, 100, 34, "orange", "ball");
        ChocoSweet alpenGold = new ChocoSweet(nameOfSweets.NAME4,250, 1100, 125,"white", "kraftFood");
        CandySweet bon_pari = new CandySweet(nameOfSweets.NAME5,30, 95, 17,"strawberry", "round");
        ChocoSweet stolichnie = new ChocoSweet(nameOfSweets.NAME6,50, 120, 56,"black", "kamunarka");
        CandySweet barbaris = new CandySweet(nameOfSweets.NAME7,25, 70, 24,"barbaris", "oval");

        List<Sweet> listOfSweets = new ArrayList<>() ;

        listOfSweets.add(ledenets);
        listOfSweets.add(milka);
        listOfSweets.add(chupa_chups);
        listOfSweets.add(alpenGold);
        listOfSweets.add(bon_pari);
        listOfSweets.add(stolichnie);
        listOfSweets.add(barbaris);


        return new Present(listOfSweets);
    }

}
