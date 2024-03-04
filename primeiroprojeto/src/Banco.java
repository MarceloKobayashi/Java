import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = leitura.nextLine();
        System.out.println("Digite o tipo de conta: ");
        String tipo = leitura.nextLine();
        System.out.println("Digite o saldo: ");
        double saldo = leitura.nextDouble();

        System.out.println("*******************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo conta: " + tipo);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("\n*******************");

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\nOperações");
            System.out.println("\n1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Tranferir valor");
            System.out.println("4- Sair");
            System.out.println("\n Digite a opção desejada: ");
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber: ");
                double deposito = leitura.nextDouble();
                saldo += deposito;
                System.out.println("\nSaldo atualizado R$ " + saldo);
            }else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                double tranferencia = leitura.nextDouble();
                if (tranferencia > saldo) {
                    System.out.println("Não há saldo suficiente para fazer essa tranferência.");
                    continue;
                } else {
                    saldo -= tranferencia;
                }
                System.out.println("Saldo atualizado R$ " + saldo);
            } else if (opcao == 4) {
                System.out.println("Muito obrigado!");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
