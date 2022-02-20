package TipoContas;

import TipoClientes.PessoaFisica;
import br.com.letscode.projetomodulo.java.Banco;
import TipoClientes.Pessoa;
import br.com.letscode.projetomodulo.java.Utils;

public class InvestimentoPJ extends Banco {

    protected int numeroConta;
    protected Pessoa pessoa;
    //protected double saldo = 0.0;

    public InvestimentoPJ(Pessoa pessoa) {
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
        return  "\nTipo Cliente: Pessoa Jurídica" +
                "\nConta Investimento" +
                "\nNúmero da conta: " + this.getNumeroConta() +
                "\nNome: " + this.pessoa.getNome() +
                "\nCNPJ: " + this.pessoa.getCNPJ() +
                "\nSaldo: " + Utils.doubleToString(this.getSaldo()) +
                '\n';
    }

}
