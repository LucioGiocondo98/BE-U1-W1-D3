public class Chiamata {
    private int durata;
    private String numeroChiamato;

    public Chiamata(int durata, String numeroChiamato){
        this.durata= durata;
        this.numeroChiamato= numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    @Override
    public String toString() {
        return "Numero:" + numeroChiamato + ", Durata: " + durata + "minuti";
    }
}
