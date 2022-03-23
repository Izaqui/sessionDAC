package dominio;

public class Ator {

    private int codAtor;
    private String nome;
    private char Sexo;
    private String nacionalidade;

    public Ator(int codAtor, String nome, char sexo, String nacionalidade) {
        this.codAtor = codAtor;
        this.nome = nome;
        Sexo = sexo;
        this.nacionalidade = nacionalidade;
    }

    public int getCodAtor() {
        return codAtor;
    }

    public void setCodAtor(int codAtor) {
        this.codAtor = codAtor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char sexo) {
        Sexo = sexo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Ator{" +
                "codAtor=" + codAtor +
                ", nome='" + nome + '\'' +
                ", Sexo=" + Sexo +
                ", nacionalidade='" + nacionalidade + '\'' +
                '}';
    }
}
