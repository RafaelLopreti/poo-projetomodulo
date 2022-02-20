package br.com.letscode.projetomodulo.java;

import TipoClientes.Pessoa;

import java.math.BigDecimal;
import java.util.Scanner;

public class Conta extends Banco {

    static Scanner input = new Scanner(System.in);

    public Conta(Pessoa pessoa) {
        this.numeroConta = contadorContas;
        this.pessoa = pessoa;
        contadorContas += 1;
    }

    public static void sacar() {
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();

        Banco banco = Banco.encontrarConta(numeroConta);

        if (banco != null) {
            System.out.println("Digite o valor para saque: ");
            double valorSaque = input.nextDouble();
            banco.sacar(valorSaque);
        } else {
            System.out.println("Conta não encontrada!");
        }
        Aplicacao.menu();
    }

    public static void sacarPJ() {
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();

        Banco banco = Banco.encontrarConta(numeroConta);

        if (banco != null) {
            System.out.println("Digite o valor para saque: ");
            double valorSaque = input.nextDouble();
            double taxaSaque = valorSaque * 0.005 + valorSaque;
            banco.sacarPJ(taxaSaque);
        } else {
            System.out.println("Conta não encontrada!");
        }
        Aplicacao.menu();
    }

    public static void depositar() {
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();

        Banco banco = Banco.encontrarConta(numeroConta);

        if (banco != null) {
            System.out.println("Digite o valor para depósito: ");
            double valorDeposito = input.nextDouble();
            banco.depositar(valorDeposito);
        } else {
            System.out.println("Conta não encontrada!");
        }
        Aplicacao.menu();
    }

    public static void transferir() {
        System.out.println("Número de sua conta: ");
        int numeroContaRemetente = input.nextInt();

        Banco contaRemetente = Banco.encontrarConta(numeroContaRemetente);

        if (contaRemetente != null) {
            System.out.println("Número da conta para qual realizar a transferência: ");
            int numeroContaDestinatario = input.nextInt();

            Banco contaDestinatario = Banco.encontrarConta(numeroContaDestinatario);

            if (contaDestinatario != null) {
                System.out.println("Valor a transferir: ");
                double valor = input.nextDouble();

                contaRemetente.transferir(contaDestinatario, valor);
            }
            Aplicacao.menu();
        }
    }

    public static void transferirPJ() {
        System.out.println("Número de sua conta: ");
        int numeroContaRemetente = input.nextInt();

        Banco contaRemetente = Banco.encontrarConta(numeroContaRemetente);

        if (contaRemetente != null) {
            System.out.println("Número da conta para qual realizar a transferência: ");
            int numeroContaDestinatario = input.nextInt();

            Banco contaDestinatario = Banco.encontrarConta(numeroContaDestinatario);

            if (contaDestinatario != null) {
                System.out.println("Valor a transferir: ");
                double valorTransferir = input.nextDouble();
                double calcularTaxa = valorTransferir * 0.005 + valorTransferir;
                double resultadoTaxa = calcularTaxa - valorTransferir;

                contaRemetente.transferirPJ(contaDestinatario, calcularTaxa, resultadoTaxa);
            }
            Aplicacao.menu();
        }
    }

    public static void investir() {
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();

        Banco banco = Banco.encontrarConta(numeroConta);

        if (banco != null) {
            System.out.println("Digite o valor para investimento: ");
            double valorInvestir = input.nextDouble();
            banco.investir(valorInvestir);
        } else {
            System.out.println("Conta não encontrada!");
        }
        Aplicacao.menu();
    }

    public static void investirPJ() {
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();

        Banco banco = Banco.encontrarConta(numeroConta);

        if (banco != null) {
            System.out.println("Digite o valor para investimento: ");
            double valorInvestir = input.nextDouble();
            double taxaInvestir = valorInvestir * 1.02;
            banco.investirPJ(taxaInvestir);
        } else {
            System.out.println("Conta não encontrada!");
        }
        Aplicacao.menu();
    }
}

