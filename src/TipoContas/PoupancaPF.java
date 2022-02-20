package TipoContas;

import br.com.letscode.projetomodulo.java.Banco;
import TipoClientes.Pessoa;
import TipoClientes.PessoaFisica;
import br.com.letscode.projetomodulo.java.Utils;

public class PoupancaPF extends Banco {

    protected int numeroConta;
    protected Pessoa pessoa;
    //protected double saldo = 0.0;

    public PoupancaPF(Pessoa pessoa) {
        this.numeroConta = contadorContas;
        this.pessoa = pessoa;
        contadorContas += 1;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaFisica pessoa) {
        this.pessoa = pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return  "\nTipo Cliente: Pessoa Física" +
                "\nConta Poupança" +
                "\nNúmero da conta: " + this.getNumeroConta() +
                "\nNome: " + this.pessoa.getNome() +
                "\nCPF: " + this.pessoa.getCPF() +
                "\nSaldo: " + Utils.doubleToString(this.getSaldo()) +
                '\n';
    }
}
