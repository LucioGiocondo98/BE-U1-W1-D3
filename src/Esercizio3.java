import java.time.LocalDate;

public class Esercizio3 {
    public static void main(String[] args) {
        Cliente cliente= new Cliente("cliente1","Lucio", "Giocondo", "lucio.giocondo@email.com", LocalDate.of(2025,5,7));
      Articolo articolo1 = new Articolo("Art01", "Dualshock4",70.00,100);
      Articolo articolo2 = new Articolo("Art02", "Dualshock5",80.99, 3);
      Carrello carrello = new Carrello(cliente);
      carrello.aggiungiArticolo(articolo1);
      carrello.aggiungiArticolo(articolo2);
      carrello.stampaDettagliCarrello();
    }
}
