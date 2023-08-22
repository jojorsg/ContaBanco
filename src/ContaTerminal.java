import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        System.out.println("*************************");
        System.out.println("*     Conta do Banco    *");
        System.out.println("*************************");

        System.out.println("");
        System.out.println("Olá, seja bem-vindo ao Conta do Banco!");
        System.out.println("Por favor, preencha os campos solicitados abaixo:");

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o número da conta: ");
        int numeroConta = scan.nextInt();
        scan.nextLine();

        System.out.println("Informe a agência: ");
        String agencia = scan.nextLine();

        System.out.println("Informe o nome do cliente: ");
        String nomeCliente = scan.nextLine();

        System.out.println("Informe o saldo da conta: ");
        double saldo = scan.nextDouble();
        scan.nextLine();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println("");
        System.out.println(mensagem);

        scan.close();
    }
}