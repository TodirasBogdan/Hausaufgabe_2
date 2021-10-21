package Hausaufgabe_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Sport basketball = new Basketball();
        Sport fussball = new Fussball();
        Sport hindernislauf = new Hindernislauf();
        Sport hochsprung = new Hochsprung();
        List<Sport> sports1 = new ArrayList<>();
        sports1.add(basketball);
        sports1.add(fussball);
        sports1.add(hindernislauf);

        Benutzer benutzer1 = new Benutzer("Paul", "Holz", sports1);

        System.out.println(benutzer1.kalkuliereZeit());
        System.out.println(benutzer1.kalkuliereZeit(hochsprung));
        System.out.println(benutzer1.kalkuliereDurchschnittszeit());

    }
}
