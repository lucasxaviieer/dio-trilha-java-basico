import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite sua conta: ");
        Integer numero = sc.nextInt();

        System.out.print("Digite a agencia: ");
        sc.nextLine();
        String agencia = sc.nextLine();

        System.out.print("Digite seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Digite seu saldo: ");
        Double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, "
                + "sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia,
                numero, saldo);

        sc.close();
    }
}
