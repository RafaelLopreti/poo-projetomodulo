package TipoClientes;

public class PessoaJuridica extends Pessoa {

    protected String nome;
    protected String CNPJ;

    public PessoaJuridica(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        Pessoa.contadorPessoas += 1;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public String toString() {
        return "\nPessoa Jurídica" +
                "\nNome: " + this.getNome() +
                "\nCNPJ: " + this.getCNPJ();
    }
}
