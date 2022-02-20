package TipoClientes;

public class Pessoa {

    protected static int contadorPessoas = 1;

    protected String nome;
    protected String CPF;
    protected String CNPJ;

    public Pessoa() {
    }

    public Pessoa(String nome, String CPF, String CNPJ) {
        this.nome = nome;
        this.CPF = CPF;
        this.CNPJ = CNPJ;
        contadorPessoas += 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public String toString() {
        return "\nPessoa" +
                "\nNome: " + this.getNome() +
                "\nCPF: " + this.getCPF() +
                "\nCNPJ: " + this.getCNPJ();
    }

}