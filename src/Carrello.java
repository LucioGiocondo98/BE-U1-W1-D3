import java.util.ArrayList;
import java.util.List;

public class Carrello {
    private Cliente cliente;
    private List <Articolo> articoli;
     public  Carrello (Cliente cliente){
         this.cliente = cliente;
         this.articoli = new ArrayList<>();

     }
     public void aggiungiArticolo(Articolo articolo){
         articolo.add(articolo);

     }
     public double calcolaTotale(){
         double totale = 0;
         for (Articolo a: articoli ){
             totale += a.getPrezzo();
         }
         return totale;
     }
     public void stampaDettagliCarrello(){
         System.out.println("Cliente: " + cliente.getNome() + " " + cliente.getCognome() + " " + cliente.getEmail());
         System.out.println("Data Iscrizione: " + cliente.getDataIscrizione());
         System.out.println("articoli nel carrello: ");
         for (Articolo a: articoli){
             System.out.println( "- " + a);
         }
         System.out.println("totale carrello : €" + calcolaTotale());

     }
}
