package dominio;

public class Cine {

    private Ator ator;
    private Evento evento;
    private Filme filme;

    public Cine(Ator ator, Evento evento, Filme filme) {
        this.ator = ator;
        this.evento = evento;
        this.filme = filme;
    }

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

}
