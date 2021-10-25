package Hausaufgabe_2;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * Hier sind die Testen fur die Benutzerklassenmethoden implementiert
 */
class BenutzerTest {

    /**
     * verifiziert ob kalkuliereZeit() richtig funktioniert
     */
    @Test
    void testKalkuliereZeit() {
        Sport basketball = new Basketball();
        Sport fussball = new Fussball();
        Sport hindernislauf = new Hindernislauf();
        List<Sport> sports1 = new ArrayList<>();
        sports1.add(basketball);
        sports1.add(fussball);
        sports1.add(hindernislauf);

        Benutzer benutzer1 = new Benutzer("Paul", "Holz", sports1);

        assert (benutzer1.kalkuliereZeit() == 150);
    }

    /**
     * verifiziert ob kalkuliereZeit(Sport) richtig funktioniert
     */
    @Test
    void testKalkuliereZeit2() {
        Sport basketball = new Basketball();
        Sport fussball = new Fussball();
        Sport hindernislauf = new Hindernislauf();
        Sport hochsprung = new Hochsprung();
        List<Sport> sports2 = new ArrayList<>();
        sports2.add(basketball);
        sports2.add(fussball);
        sports2.add(hindernislauf);

        Benutzer benutzer2 = new Benutzer("Paul", "Holz", sports2);

        assert (benutzer2.kalkuliereZeit(hochsprung) == 20);
    }

    /**
     * verifiziert ob kalkuliereDurchschnittszeit() richtig funktioniert
     */
    @Test
    void kalkuliereDurchschnittszeit() {
        Sport basketball = new Basketball();
        Sport fussball = new Fussball();
        Sport hindernislauf = new Hindernislauf();
        List<Sport> sports3 = new ArrayList<>();
        sports3.add(basketball);
        sports3.add(fussball);
        sports3.add(hindernislauf);

        Benutzer benutzer3 = new Benutzer("Paul", "Holz", sports3);

        assert (benutzer3.kalkuliereDurchschnittszeit() == 50);
    }
}