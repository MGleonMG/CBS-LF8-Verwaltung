package verwaltung.Kurs;

import java.util.ArrayList;

import verwaltung.Interfaces.Bewertbar;
import verwaltung.Interfaces.Rabattfaehig;

public class Kurs implements Rabattfaehig, Bewertbar {

    private int kursnummer;
    private String kursname;
    private int maxTeilnehmer;
    private int anzahlTeilnehmer;
    private double kursgebuehr;
    private Kursteilnehmer teilnehmerliste;

    private boolean Placeholder;

    public Kurs(int kursnummer, String kursname, int maxTeilnehmer, double kursgebuehr, Kursteilnehmer Kursteilnehmer) {

    }

    public static void buchen() {

    }

    public static void stornieren() {

    }

    public String zeigeAlleTeilnehmenden() {
        return kursname;
        /*
         * Kursname ist Placeholder
         */
    }

    public boolean sucheTeilnehmenden() {
        return Placeholder;
    }

    public Kursteilnehmer aeltesterTeilnehmer() {
        return teilnehmerliste;
    }

    public String zeigeKursInfo() {
        return kursname;
    }

    public String getKursname() {
        return kursname;
    }

    public void setKursname(String pKursname) {
        kursname = pKursname;
    }

    public int getKursnummer() {
        return kursnummer;
    }

    public void setKursnummer(int pKursnummer) {
        kursnummer = pKursnummer;
    }

    public int getMaxTeilnehmer() {
        return maxTeilnehmer;
    }

    public void setMaxTeilnehmer(int pMaxTeilnehmer) {
        maxTeilnehmer = pMaxTeilnehmer;
    }

    public int getAnzahlteilnehmer() {
        return anzahlTeilnehmer;
    }

    public void setAnzahlteilnehmer(int pAnzahlteilnehmer) {
        anzahlTeilnehmer = pAnzahlteilnehmer;
    }

    public double getKursgebuehr() {
        return kursgebuehr;
    }

    public void setKursgebuehr(double pKursgebuehr) {
        kursgebuehr = pKursgebuehr;
    }

    public Kursteilnehmer getTeilnehmerliste() {
        return teilnehmerliste;
    }

    @Override
    public void bewerten(int bewertung) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bewerten'");
    }

    @Override
    public ArrayList<Integer> getBewertungen() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBewertungen'");
    }

    @Override
    public int getAnzahlBewertungen() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAnzahlBewertungen'");
    }

    @Override
    public double getDurchschnittsbewertung() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDurchschnittsbewertung'");
    }
}
