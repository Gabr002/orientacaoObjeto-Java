package AtividadeBanco;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        FuncoesBanco conta1 = new FuncoesBanco();


        System.out.println("Qual o nome da conta: ");
        conta1.setNome(entrada.nextLine());

        while (conta1.getEntrada() != 4) {
            System.out.println("\nOlá, Bem vindo! ao B6 \n");
            System.out.println("=================== \n");
            System.out.println("(1) - Sacar \n(2) - Depositar \n(3) - Saldo \n4 - Sair \n");
            conta1.setEntrada(entrada.nextInt());
            switch (conta1.getEntrada()) {
                case 1:
                        System.out.println("Você tem R$ " + conta1.getSaldo() + "\n");
                        System.out.println("Valor do saque: ");
                        conta1.setSaque(entrada.nextInt());
                        
                    break;
                case 2:
                        System.out.println("Você tem R$ " + conta1.saldo);
                        System.out.println("Valor do Deposito: ");
                        conta1.setDeposito(entrada.nextInt());
                        System.out.println("Deposito Realizado com Sucesso!");
                    break;
                case 3:
                    System.out.println("Saldo da conta " + conta1.getSaldo() + ": R$" + conta1.saldo);
                    break;
                default:
                        System.out.println("Obrigado, " + conta1.getNome() + " Volte Sempre!");
                    break;
            }
        }
    }
}
