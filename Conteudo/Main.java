package Conteudo;



import java.util.Random;
import java.util.Scanner;

import Conteudo.Classes.Funcionario;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        /*String nome = "Neil Peart";
        int ID = 2112;
        double salario = 1000000;

        Funcionario chefe = new Funcionario(nome, ID, salario);

        chefe.exibir(); */

        // Usamos o get para obter informações. Esse tipo de método sempre retorna um valor. Usamos set para definir valores. Esse tipo de método geralmente não retorna valores.

        // Aplicativo: Simulação simples de conta bancária
        
        String nome;
        System.out.println("Seu nome: ");
        nome = leitor.nextLine();
        double saldoInicial;
        System.out.println("Digite seu saldo Inicial: ");
        saldoInicial = leitor.nextDouble();
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);
        int opc;

        Funcionario c1 = new Funcionario(nome, conta, saldoInicial);
    
        c1.menuOpcoes();
        System.out.println("Qual opcao voce deseja: ");
        opc = leitor.nextInt();
        c1.switchDeOperacoes(opc);

        // Parei na página 214 - 2º paragrafo.
    }
}
