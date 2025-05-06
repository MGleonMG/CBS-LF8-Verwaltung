package verwaltung;

import java.time.LocalDate;

public final class Kursteilnehmer {

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
        return placeholder;
    }
}
