package dominio;

import java.time.LocalDate;

public class Evento {

    private int codEvent;
    private String Nome;
    private String local;
    private LocalDate ano;

    public Evento(int codEvent, String nome, String local, LocalDate ano) {
        this.codEvent = codEvent;
        Nome = nome;
        this.local = local;
        this.ano = ano;
    }

    public int getCodEvent() {
        return codEvent;
    }

    public void setCodEvent(int codEvent) {
        this.codEvent = codEvent;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "codEvent=" + codEvent +
                ", Nome='" + Nome + '\'' +
                ", local='" + local + '\'' +
                ", ano=" + ano +
                '}';
    }
}
