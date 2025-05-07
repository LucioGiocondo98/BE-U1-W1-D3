public class Esercizio1 {
    public static void main(String[] args) {
Rettangolo rettangolo1= new Rettangolo(5,8);
Rettangolo rettangolo2 = new Rettangolo(10,7);
        System.out.println("stampo rettangolo singolo");
        rettangolo1.stampaRettangolo();

        System.out.println("stampo i due rettangoli");
        Rettangolo.stampaDueRettangoli(rettangolo1,rettangolo2);
    }

}
