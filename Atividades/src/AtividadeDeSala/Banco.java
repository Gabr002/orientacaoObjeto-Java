import java.util.Scanner;
import classes.Funcoes;

public class Banco {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Funcoes conta1 = new Funcoes();
        int opc = 0, value = 2;

        System.out.println("Qual o nome da conta: ");
        conta1.nome = entrada.nextLine();

        while (value != 0) {
            System.out.println("\nOlá, Bem vindo! B6 \n");
            System.out.println("=================== \n");
            System.out.println("(1) - Sacar \n(2) - Depositar \n(3) - Saldo \n0 - Sair \n");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                        System.out.println("Você tem R$ " + conta1.saldo + "\n");
                        System.out.println("Valor do saque: ");
                        int valorSaq = entrada.nextInt();
                        if(valorSaq < conta1.saldo)
                            conta1.saldo = conta1.saque(valorSaq);
                        else
                            System.out.println("\nSaldo Indisponivel!");
                    break;
                case 2:
                        System.out.println("Você tem R$ " + conta1.saldo);
                        System.out.println("Valor do Deposito: ");
                        
                        int valorDep = entrada.nextInt();
                        conta1.saldo = conta1.deposito(valorDep);
                    break;
                case 3:
                    System.out.println("Saldo da conta " + conta1.nome + ": R$" + conta1.saldo);
                    break;
                default:
                        System.out.println("Obrigado, Volte Sempre!");
                    break;
            }
            value = opc;
        }
    }
}
