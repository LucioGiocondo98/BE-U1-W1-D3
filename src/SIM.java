import java.util.LinkedList;
import java.util.List;

public class SIM {
    private String numeroTelefono;
    private double credito;
    private List<Chiamata> ultimeChiamate;

    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0;
        this.ultimeChiamate = new LinkedList<>();
    }

    public void stampaDatiSIM() {
        System.out.println("numero : " + numeroTelefono);
        System.out.println("credito: " + credito);
        System.out.println("ultime 5 chiamate: ");
        if (ultimeChiamate.isEmpty()) {
            System.out.println("Nessuna chiamata effettuata.");
        } else {
            for (Chiamata c : ultimeChiamate) {
                System.out.println(c);
            }

        }
    }

    public double getCredito() {
        return credito;
    }
    public void ricarica(double importo){
        if (importo>0){
            credito += importo;
        }
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
