import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String nome = "Fernando Saraiva";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("**************************************");
        System.out.println("Titular da conta: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.printf("Saldo atual: R$ %.2f%n",saldo);
        System.out.println("**************************************");

        String menu = "---------MENU---------\n1 - Consultar saldo\n2 - Sacar\n3 - Depositar\n4 - Sair";

        Scanner scan = new Scanner(System.in);

        int opcao = 0;
        while(opcao != 4){
            System.out.println(menu);
            System.out.print("Digite sua opção: ");
            opcao = scan.nextInt();

            if(opcao == 1){
                System.out.printf("Seu saldo atual é R$ %.2f%n", saldo);
            
            }else if(opcao == 2){
                if(saldo > 0){
                    System.out.print("Informe o valor do saque: R$ ");
                    double saque = scan.nextDouble();

                    if(saque <= saldo){
                        saldo -= saque;
                        System.out.printf("Novo saldo: R$ %.2f%n",saldo);
                    
                    }else{
                        System.out.println("Saldo indisponível!");
                        System.out.printf("Valor disponível para saque: R$ %.2f%n", saldo);
                        continue;
                    }
                    }else{
                        System.out.println("Não há valores disponiveis para saque! R$ " + saldo);
                        continue;
                 }
            }else if(opcao == 3){
                 System.out.print("Digite o valor do deposito: R$ ");
                 double valor = scan.nextDouble();
                 saldo += valor;
                 System.out.printf("Novo saldo: R$ %.2f%n",saldo);
            }else if(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4){
                System.out.println("Opção inválida!");
            }

        }

    }
}
