package dominio;

import java.util.List;

public class Banda {
    private int id;
    private String localDeOrigem;
    private String nomeFantasia;
    private List<Integrantes> integrantes;

    public Banda() {
        this.id = id;
        this.localDeOrigem = localDeOrigem;
        this.nomeFantasia = nomeFantasia;
        this.integrantes = integrantes;
    }

    public Banda(Object s) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalDeOrigem() {
        return localDeOrigem;
    }

    public void setLocalDeOrigem(String localDeOrigem) {
        this.localDeOrigem = localDeOrigem;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public List<Integrantes> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<Integrantes> integrantes) {
        this.integrantes = integrantes;
    }

    public void setIntegrantes() {
    }
}
