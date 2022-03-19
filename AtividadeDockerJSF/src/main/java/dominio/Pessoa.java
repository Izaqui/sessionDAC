package dominio;

public class Pessoa {

    private String nome;
    private long id;
    private Object cpf;
    private Dependente dependente;

    public Pessoa(String nome) {
        this(nome, "11111111111");
    }
    public Pessoa() {
        this.nome = nome;
        this.id = System.currentTimeMillis();
        this.cpf = new CPF(cpf);
    }
    public void alterarNome() {
        this.nome = this.nome.toUpperCase();
    }
    public void alterarNomeMinusculo() {
        this.nome = this.nome.toLowerCase();
    }

    public static Pessoa fake(){
        return new Pessoa("fake");
    }

    public Dependente getDependente() {
        return dependente;
    }
    public void setDependente(Object dependente) {
        this.dependente = dependente;
    }
    public Object getCpf() {
        return cpf;
    }
    public void setCpf(Object cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getId() {
        return id;
    }

}
