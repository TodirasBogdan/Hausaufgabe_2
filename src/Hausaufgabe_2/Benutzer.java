package Hausaufgabe_2;

import java.util.List;

/**
 * Ein Benutzer will eine kleine Anwendung haben, womit er die nötige Zeit für die Treibung aller seinem
 * Lieblingssportarten berechnen kann. Er möchte auch wissen, wie viel Zeit für eine Sportart gebraucht
 * wird. Er möchte auch wissen wie lange er durchschnittlich für seinen Lieblingssport braucht.
 */

public class Benutzer {

    private String vorName;
    private String nachName;
    private List<Sport> sport;

    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public List<Sport> getSport() {
        return sport;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }

    /**
     * kalkuliert die nötige Zeit für die Treibung aller Lieblingssportarten der Benutzer
     * @return die totale Zeit für die Treibung aller Sportarten in der Sportliste der Benutzer
     */
    public double kalkuliereZeit() {
        double total = 0;
        for (Sport s : sport) {
            total += s.kalkuliereZeit();
        }
        return total;
    }

    /**
     * kalkuliert wie viel Zeit eine Sportart braucht
     * @param sport ist die gesuchte Sportart
     * @return wie viel Zeit für sport gebraucht wird
     */
    public double kalkuliereZeit(Sport sport) {
        return sport.kalkuliereZeit();
    }

    /**
     * kalkuliert wie lange der Benutzer durchschnittlich für seinen Lieblingssport braucht
     * @return die Durchschnittszeit für die Treibung aller Sportarten in der Sportliste der Benutzer
     */
    public double kalkuliereDurchschnittszeit() {
        double total = 0, anzahl = 0;
        for (Sport s : sport) {
            total += s.kalkuliereZeit();
            anzahl++;
        }
        return total / anzahl;
    }

}
