import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String numeroConta;
        int agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Por favor, digite o número da Agência! ");
         agencia = scanner.nextInt();


         System.out.println("Por favor, digite o número da Conta! ");
         numeroConta = scanner.nextLine();
        
         scanner.nextLine();
         
         System.out.println("Por favor, digite o seu Nome ");
         nomeCliente = scanner.nextLine();
        
         System.out.println("Por favor, digite o seu Saldo ");
         saldo = scanner.nextDouble();

        
        System.out.println("Olá," + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia +  ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    
     
    }
}
