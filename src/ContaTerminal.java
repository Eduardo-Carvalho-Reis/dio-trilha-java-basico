import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String Nome_Cliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero");
        numero=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digete a agencia. Ex. xxx-x");
        agencia = scanner.nextLine();
        System.out.println("Digite o nome do cliente");
        Nome_Cliente = scanner.nextLine();
        System.out.println("Digite o saldo da conta");
        saldo = scanner.nextDouble();
        System.out.println("Ola " + Nome_Cliente + ", obrigado por criar uma conta em nosso banco,sua agencia é " + agencia + ",conta " + numero + " e seu saldo " + saldo + " esta disponivel para saque");

    }
}
