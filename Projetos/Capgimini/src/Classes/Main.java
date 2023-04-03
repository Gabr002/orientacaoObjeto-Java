package Classes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Paradigmas de orintação objeto
        // Programação Estruturada e Programação Orientada a Objetos
        // Trabalhando com métodos
        // Entendendo o que é uma classe.
        // Encapsulamento
        // Modificador de acesso
        Pessoa objetoPessoa = new Pessoa(); // Class Pessoa Objeto...
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o peso da pessoa: ");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.println("Digite a altura da pessoa: ");
        objetoPessoa.setAltura(leitor.nextFloat());

        System.out.println("IMC = " + objetoPessoa.calcularIMC());
        
        // Método Construtor
    }
}