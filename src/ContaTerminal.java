
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String Nome_Cliente;
        double saldo;
        boolean ValidarEntrada= false;


        Scanner scanner = new Scanner(System.in);
       do {
           try {
               System.out.println("Digite o numero");
               numero = scanner.nextInt();
               scanner.nextLine();

               System.out.println("Digete a agencia. Ex. xxx-x");
               agencia = scanner.nextLine();
               if (!agencia.matches("\\d{3}-\\d")) {
                   throw new IllegalArgumentException("Agência inválida! Use o formato xxx-x");
               }

               System.out.println("Digite o nome do cliente");
               Nome_Cliente = scanner.nextLine();
               if (Nome_Cliente.matches(".*\\d.*")) {
                   throw new IllegalArgumentException("Nome inválido! Não pode conter números.");
               }
               System.out.println("Digite o saldo da conta");
               saldo = scanner.nextDouble();
               ValidarEntrada=true;
               System.out.println("Ola " + Nome_Cliente + ", obrigado por criar uma conta em nosso banco,sua agencia é " + agencia + ",conta " + numero + " e seu saldo " + saldo + " esta disponivel para saque");

           } catch (InputMismatchException e) {
               System.out.println("Digite um valor numerico");
               scanner.nextLine();
           }catch (IllegalArgumentException e){
               System.out.println("erro" + e.getMessage());
           }
       }while (!ValidarEntrada);
     }
}
