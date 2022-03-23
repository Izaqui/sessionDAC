package dominio;

import java.time.LocalDate;

public class Filme {
    private int codFilm;
    private String título;
    private LocalDate Ano;
    private String genero;
    private String diretor;

    public Filme(int codFilm, String título, LocalDate ano, String genero, String diretor) {
        this.codFilm = codFilm;
        this.título = título;
        Ano = ano;
        this.genero = genero;
        this.diretor = diretor;
    }

    public int getCodFilm() {
        return codFilm;
    }

    public void setCodFilm(int codFilm) {
        this.codFilm = codFilm;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public LocalDate getAno() {
        return Ano;
    }

    public void setAno(LocalDate ano) {
        Ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "codFilm=" + codFilm +
                ", título='" + título + '\'' +
                ", Ano=" + Ano +
                ", genero='" + genero + '\'' +
                ", diretor='" + diretor + '\'' +
                '}';
    }
}
