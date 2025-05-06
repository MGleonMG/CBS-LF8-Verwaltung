public class Kurs {

    private int kursnummer;
    private String kursname;
    private int maxTeilnehmer;
    private int anzahlTeilnehmer;
    private double kursgebuehr;
    private Kursteilnehmer teilnehmerliste;
    
    private boolean Placeholder;

    public Kurs(int kursnummer, String kursname,int maxTeilnehmer, double kursgebuehr, Kursteilnehmer Kursteilnehmer){


    }

        public static void buchen(){

        }

        public static void stornieren(){

        }

        public String zeigeAlleTeilnehmenden(){
            return kursname;
            /*
             * Kursname ist Placeholder
             */
        }

        public boolean sucheTeilnehmenden(){
            return Placeholder;
            /*
             * Placeholder
             */
        }

        public Kursteilnehmer aeltesterTeilnehmer(){
            return teilnehmerliste;
        }

        public String zeigeKursInfo(){
            return kursname;
            /*
             * Placeholder
             */
        }

        public String getKursname(){
            return kursname;
        }

        public void setKursname(String pKursname){
            kursname = pKursname;
        }

        public int getKursnummer(){
            return kursnummer;
        }

        public void setKursnummer(int pKursnummer){
            kursnummer = pKursnummer;
        }

        public int getMaxTeilnehmer(){

        }

        public int getAnzahlteilnehmer(){

        }

        public
}
