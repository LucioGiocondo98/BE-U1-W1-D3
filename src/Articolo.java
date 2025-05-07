public class Articolo {
   private String codice;
   private String descrizione;
   private double prezzo;
   private int pezziDisponibili;
   public Articolo(String codice,String descrizione, double prezzo, int pezziDisponibili){
this.codice = codice;
this.descrizione = descrizione;
this.prezzo= prezzo;
this.pezziDisponibili = pezziDisponibili;
   }

   public String getCodice() {
      return codice;
   }

   public String getDescrizione() {
      return descrizione;
   }

   public int getPezziDisponibili() {
      return pezziDisponibili;
   }
   public void riduciPezziDisponibili(int quantita){
      if (quantita<= pezziDisponibili){
         pezziDisponibili -= quantita;
      } else {
         System.out.println("Quantità richiesta maggiore della disponibilità!");
      }
   }

   public double getPrezzo() {
      return prezzo;
   }

   @Override
   public String toString() {
      return descrizione + " (€ "+ prezzo + ")- Codice: " + codice;
   }
}
