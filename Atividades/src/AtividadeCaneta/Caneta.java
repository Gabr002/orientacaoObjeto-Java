import java.util.Scanner;

import classes.CanetaFuncoes;

public class Caneta {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        CanetaFuncoes c1 = new CanetaFuncoes();
        CanetaFuncoes c2 = new CanetaFuncoes();

        System.out.println("Digite o modelo: ");
        c1.setModelo(leitor.nextLine());
        System.out.println("Digite a cor: ");
        c1.setCor(leitor.nextLine());
        System.out.println("Tampada: 1 ou 0");
        c1.setCheckTampada(leitor.nextBoolean());

        System.out.println("Digite o modelo: ");
        c2.setModelo(leitor.nextLine());
        System.out.println("Digite a cor: ");
        c2.setCor(leitor.nextLine());
        System.out.println("Tampada: 1 ou 0");
        c2.setCheckTampada(leitor.nextBoolean());

        System.out.println("\nEstá tampada ou não?\n");

        c1.getCheckTampada();
        c2.getCheckTampada();


        System.out.println("\nEssa caneta 1 de modelo " + c1.getModelo() + " tem cor " + c1.getCor() + ".");
        System.out.println("\nEssa caneta 2 de modelo " + c2.getModelo() + " tem cor " + c2.getCor() + ".");

    }
}
