package verwaltung.struktur;

import java.util.ArrayList;

public abstract class Person {
    protected String nachname;
    protected String vorname;
    protected String adresse;
    protected String geburtsdatum;

    private static ArrayList<Person> personenListe = new ArrayList<>();

    public Person(String nachname, String vorname, String adresse, String geburtsdatum) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.adresse = adresse;
        this.geburtsdatum = geburtsdatum;
        personenListe.add(this);
    }

    public Person() {
        personenListe.add(this);
    }

    public abstract void zeigeInfo();

    public static int gibAnzahlPersonen() {
        return personenListe.size();
    }

    public static void druckePersonen() {
        for (Person person : personenListe) {
            person.zeigeInfo();
        }
    }

    public String gibNachname() {
        return nachname;
    }

    public void setzeNachname(String nachname) {
        this.nachname = nachname;
    }

    public String gibVorname() {
        return vorname;
    }

    public void setzeVorname(String vorname) {
        this.vorname = vorname;
    }

    public String gibAdresse() {
        return adresse;
    }

    public void setzeAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String gibGeburtsdatum() {
        return geburtsdatum;
    }

    public void setzeGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }
}