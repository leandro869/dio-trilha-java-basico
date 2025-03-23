import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        

        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Garante que o separador decimal seja ponto (.)
        
        //Exibir as Mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Agência !");
        //Obter pela scanner os valores digitados no terminal
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        
        //Exibir as Mensagens para o nosso usuário
        System.out.println("Por favor, digite a Agência !");
        //Obter pela scanner os valores digitados no terminal
        String agencia = scanner.nextLine();
        
        //Exibir as Mensagens para o nosso usuário
        System.out.println("Por favor, digite o Nome do Cliente");
        //Obter pela scanner os valores digitados no terminal
        String nomeCliente = scanner.nextLine();
        
        //Exibir as Mensagens para o nosso usuário
        System.out.println("Por favor, digite o Saldo");
        //Obter pela scanner os valores digitados no terminal
        double saldo = scanner.nextDouble();
        
        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                + agencia + ", conta " + numero + " e seu saldo " + String.format("%.2f", saldo) 
                + " já está disponível para saque.");
    }
}
