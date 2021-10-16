package Hausaufgabe_2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Sport Basketball = new Basketball();
        Sport Fussball = new Fussball();
        Sport Hindernislauf = new Hindernislauf();
        Sport Hochsprung = new Hochsprung();
        List<Sport> sports1 = new ArrayList<Sport>();
        sports1.add(Basketball);
        sports1.add(Fussball);
        sports1.add(Hindernislauf);

        Benutzer B1 = new Benutzer("Paul", "Holz", sports1);

        System.out.println(B1.kalkuliereZeit());
        System.out.println(B1.kalkuliereZeit(Hochsprung));
        System.out.println(B1.kalkuliereDurchschinttszeit());

    }
}
