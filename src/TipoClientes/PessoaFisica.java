package TipoClientes;

public class PessoaFisica extends Pessoa {

    protected String nome;
    protected String CPF;

    public PessoaFisica(String nome, String CPF, Object o) {
        this.nome = nome;
        this.CPF = CPF;
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

    @Override
    public String getCPF() {
        return CPF;
    }

    @Override
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "\nPessoa Física" +
                "\nNome: " + this.getNome() +
                "\nCPF: " + this.getCPF();
    }
}
