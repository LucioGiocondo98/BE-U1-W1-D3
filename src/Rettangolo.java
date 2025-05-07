public class Rettangolo {
    private int altezza;
    private int larghezza;

    public Rettangolo(int altezza,int larghezza){
        this.altezza= altezza;
        this.larghezza= larghezza;
    }

    public int calcolaArea(){
        return altezza * larghezza;
    }
    public int calcolaPerimetro(){
        return 2*(altezza + larghezza);

    }

    public  void stampaRettangolo(){
        System.out.println("area: " + calcolaArea());
        System.out.println("perimetro: " + calcolaPerimetro());
    }

    public int getLarghezza() {
        return larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2){
        System.out.println("rettangolo 1 ");
        r1.stampaRettangolo();

        System.out.println("rettangolo 2 ");
        r2.stampaRettangolo();



        int sommaAree = r1.calcolaArea() + r2.calcolaArea();
        System.out.println("la somma delle aree è : "+ sommaAree);

        int sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();
        System.out.println("la somma dei perimetri è : " + sommaPerimetri);
    }

}
