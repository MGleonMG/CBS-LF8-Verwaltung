package verwaltung.Interface;

import java.util.ArrayList;

public interface Bewertbar {
    void bewerten(int bewertung);
    ArrayList<Integer> getBewertungen();
    int getAnzahlBewertungen();
    double getDurchschnittsbewertung();
}

// Beispielhafte Implementierung des Interfaces
class Produkt implements Bewertbar {
    private ArrayList<Integer> bewertungen = new ArrayList<>();

    @Override
    public void bewerten(int bewertung) {
        bewertungen.add(bewertung);
    }

    @Override
    public ArrayList<Integer> getBewertungen() {
        return new ArrayList<>(bewertungen);
    }

    @Override
    public int getAnzahlBewertungen() {
        return bewertungen.size();
    }

    @Override
    public double getDurchschnittsbewertung() {
        if (bewertungen.isEmpty()) {
            return 0.0;
        }
        int summe = 0;
        for (int b : bewertungen) {
            summe += b;
        }
        return (double) summe / bewertungen.size();
    }
}