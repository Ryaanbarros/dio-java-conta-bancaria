import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da Conta: ");
        int conta = scanner.nextInt();
        
        System.out.println("Agora digite o número da agência: ");
        String agencia = scanner.next();

        scanner.nextLine(); //Adicionei esta linha para consumir a nova linha restante

        System.out.println("Digite o seu nome");
        String nomeCliente = scanner.nextLine();  //nextLine() lê a entrada até o fim da linha, por tanto nao vai cortar o nome.
        
        System.out.println("Digite o saldo para saque: ");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
