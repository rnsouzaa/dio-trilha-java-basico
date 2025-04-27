import java.util.Scanner;
import java.util.Locale;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        
    //Conhecer e importar a classe Scanner
    
    //Exibir as mensagens para o nosso usuario

    //Obter pela scanner os vlores digitados no terminal

    //Exibir a mensagem de conta criada.

    Scanner scanner = (new Scanner(System.in).useLocale(Locale.US));

    System.out.println("Digite o numero da conta bancaria: ");
    int numConta = scanner.nextInt();

    System.out.println("Digite o numero da Agencia: ");
    String codAgencia = scanner.next();

    System.out.println("Informe o nome do cliente: ");
    String nomCliente = scanner.next();

    System.out.println("Informe o saldo da conta: ");
    float salConta = scanner.nextFloat();

    
    // Imprimindo os dados da conta bancaria.
    System.out.println("Agencia " + codAgencia + " e Conta " + numConta +  " criado com sucesso");
    System.out.println("Nome do cliente " + nomCliente);
    System.out.println("Saldo disponivel em conta " + salConta);

    }
}
