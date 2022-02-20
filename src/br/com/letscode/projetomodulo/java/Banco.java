package br.com.letscode.projetomodulo.java;

import TipoClientes.Pessoa;
import TipoClientes.PessoaFisica;
import TipoClientes.PessoaJuridica;
import TipoContas.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Banco> contasBancarias;

    protected static int contadorContas = 1;
    protected int numeroConta;
    protected Pessoa pessoa;
    protected double saldo = 0.0;

    public Banco() {
    }

    public Banco(Pessoa pessoa) {
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

    public void setPessoa(Pessoa pessoa) {
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
        return  "\nNúmero da conta: " + this.getNumeroConta() +
                "\nNome: " + this.pessoa.getNome() +
                "\nCPF: " + this.pessoa.getCPF() +
                "\nCNPJ: " + this.pessoa.getCNPJ() +
                "\nSaldo: " + Utils.doubleToString(this.getSaldo()) +
                "\n";
    }

    public static void criarCorrentePF() {
        System.out.println("\nDigite seu nome: ");
        String nome = input.nextLine();

        System.out.println("\nDigite seu CPF: ");
        String cpf = input.nextLine();

        PessoaFisica pessoa = new PessoaFisica(nome, cpf, null);
        CorrentePF conta = new CorrentePF(pessoa);
        Banco.contasBancarias.add(conta);
        System.out.println("\nConta criada com sucesso!");
        Aplicacao.menu();
    }

    public static void criarPoupancaPF() {
        System.out.println("\nDigite seu nome: ");
        String nome = input.nextLine();

        System.out.println("\nDigite seu CPF: ");
        String cpf = input.nextLine();

        PessoaFisica pessoa = new PessoaFisica(nome, cpf, null);
        PoupancaPF conta = new PoupancaPF(pessoa);
        Banco.contasBancarias.add(conta);
        System.out.println("\nConta criada com sucesso!");
        Aplicacao.menu();
    }

    public static void criarInvestimentoPF() {
        System.out.println("\nDigite seu nome: ");
        String nome = input.nextLine();

        System.out.println("\nDigite seu CPF: ");
        String cpf = input.nextLine();

        PessoaFisica pessoa = new PessoaFisica(nome, cpf, null);
        InvestimentoPF conta = new InvestimentoPF(pessoa);
        Banco.contasBancarias.add(conta);
        System.out.println("\nConta criada com sucesso!");
        Aplicacao.menu();
    }

    public static void criarCorrentePJ() {
        System.out.println("\nDigite seu nome: ");
        String nome = input.nextLine();

        System.out.println("\nDigite seu CNPJ: ");
        String cnpj = input.nextLine();

        PessoaJuridica pessoa = new PessoaJuridica(nome, cnpj);
        CorrentePJ conta = new CorrentePJ(pessoa);
        Banco.contasBancarias.add(conta);
        System.out.println("\nConta criada com sucesso!");
        Aplicacao.menu();
    }

    public static void criarInvestimentoPJ() {
        System.out.println("\nDigite seu nome: ");
        String nome = input.nextLine();

        System.out.println("\nDigite seu CNPJ: ");
        String cnpj = input.nextLine();

        PessoaJuridica pessoa = new PessoaJuridica(nome, cnpj);
        InvestimentoPJ conta = new InvestimentoPJ(pessoa);
        Banco.contasBancarias.add(conta);
        System.out.println("\nConta criada com sucesso!");
        Aplicacao.menu();
    }

    public void depositar (double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso! Saldo atual: R$" + saldo);
        } else {
            System.out.println("Não foi possível realizar o depósito! Saldo atual: R$" + saldo);
        }
    }

    public void sacar (double valor) {
        if (valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso! Saldo atual: R$" + saldo);
        } else {
            System.out.println("Não foi possível realizar o saque! Saldo atual: R$" + saldo);
        }
    }

    public void sacarPJ (double valor) {
        if (valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso, tarifa de 0.5%! Saldo atual: R$" + saldo);
        } else {
            System.out.println("Não foi possível realizar o saque! Saldo atual: R$" + saldo);
        }
    }

    public void transferir (Banco contaParaTransferir, double valor) {
        if (valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);

            contaParaTransferir.saldo = contaParaTransferir.getSaldo() + valor;

            System.out.println("Transferência realizada com sucesso! Saldo atual: R$" + saldo);
        } else {
            System.out.println("Não foi possível realizar a transferência! Saldo atual: R$" + saldo);
        }
    }

    public void transferirPJ(Banco contaParaTransferir, double valor, double resultadoTaxa) {

        if (valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);

            contaParaTransferir.saldo = contaParaTransferir.getSaldo() + valor - resultadoTaxa;

            System.out.println("Transferência realizada com sucesso, tarifa de 0.5%! Saldo atual: R$" + saldo);
        } else {
            System.out.println("Não foi possível realizar a transferência! Saldo atual: R$" + saldo);
        }
    }

    public void investir (double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Investimento realizado com sucesso! Saldo atual: R$" + saldo);
        } else {
            System.out.println("Não foi possível realizar o investimento! Saldo atual: R$" + saldo);
        }
    }

    public void investirPJ (double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Investimento realizado com sucesso, adicionado 2% de rendimento extra! " +
                    "Saldo atual: R$" + saldo);
        } else {
            System.out.println("Não foi possível realizar o investimento! Saldo atual: R$" + saldo);
        }
    }

    protected static Banco encontrarConta(int numeroConta) {
        Banco banco = null;
        if (Banco.contasBancarias.size() > 0) {
            for (Banco c : Banco.contasBancarias) {
                if (c.getNumeroConta() == numeroConta) {
                    banco = c;
                }
            }
        }
        return banco;
    }

    public static void consultarContas() {
        if (Banco.contasBancarias.size() > 0) {
            for (Banco banco : Banco.contasBancarias) {
                System.out.println(banco);
            }
        } else {
            System.out.println("Não há contas cadastradas!");
        }
        Aplicacao.menu();
    }

}
