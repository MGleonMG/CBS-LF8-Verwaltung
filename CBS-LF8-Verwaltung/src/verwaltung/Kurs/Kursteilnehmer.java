package verwaltung.Kurs;

import java.time.LocalDate;

import verwaltung.struktur.Person;

public final class Kursteilnehmer extends Person {

    private final int MAX_KURSE = 2;
    private static int anzahlKursteilnehmer = 0;
    private int anzahlGebuchterKurse = 0;
    private Kurs[] kurse = new Kurs[MAX_KURSE];

    private String name;
    private String vorname;
    private String adresse;
    private LocalDate geburtsdatum;

    private String placeholder;

    public Kursteilnehmer(String pName, String pVorname, String pAdresse, LocalDate pGeburtsdatum) {
        name = pName;
        vorname = pVorname;
        adresse = pAdresse;
        geburtsdatum = pGeburtsdatum;
    }

    public Kursteilnehmer(String pName, String pVorname, String pAdresse, LocalDate pGeburtsdatum, Kurs pKurse) {
        name = pName;
        vorname = pVorname;
        adresse = pAdresse;
        geburtsdatum = pGeburtsdatum;
        if (kurse != null) {
            for (int i = 0; i < kurse.length && i < MAX_KURSE; i++) {
                this.kurse[i] = kurse[i];
                anzahlGebuchterKurse++;
            }
        }
    }

    public void bucheKurs() {

    }

    public void storniereKurs() {

    }

    public void zeigeKurse() {

    }

    public String zeigeInfos() {
        return placeholder; // TODO: ..
    }

    public int getMaxKurse() {
        return MAX_KURSE;
    }

    public int getAnzahlKursteilnehmer() {
        return anzahlKursteilnehmer;
    }

    public void setAnzahlKursteilnehmer(int pAnzahlKursteilnehmer) {
        anzahlKursteilnehmer = pAnzahlKursteilnehmer;
    }

    public int getAnzahlGebuchterKurse() {
        return anzahlGebuchterKurse;
    }

    public void setAnzahlGebuchterKuse(int pAnzahlGebuchterKurse) {
        anzahlGebuchterKurse = pAnzahlGebuchterKurse;
    }

    public Kurs[] getKurse() {
        return kurse;
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        name = pName;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String pVorname) {
        vorname = pVorname;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String pAdresse) {
        adresse = pAdresse;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(LocalDate pGeburtsdatum) {
        geburtsdatum = pGeburtsdatum;
    }

    @Override
    public void zeigeInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'zeigeInformation'");
    }

}
