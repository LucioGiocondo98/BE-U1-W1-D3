import java.time.LocalDate;

public class Cliente {
    private String codice;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataIscrizione;

    public Cliente(String codice, String nome, String cognome, String email, LocalDate dataIscrizione){
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public LocalDate getDataIscrizione() {
        return dataIscrizione;
    }

    public String getEmail() {
        return email;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCodice() {
        return codice;
    }
}
