package verwaltung.struktur;

public interface Rabattfaehig {

    public static void applyRabatt(double prozent) {
        System.out.println("Ein Rabatt von " + prozent + "% wurde angewendet.");
    }

}
