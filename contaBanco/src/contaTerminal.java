import java.util.Scanner;
import java.util.Locale;


public class contaTerminal{
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite o número da Conta: ");
        int nConta = sc.nextInt();

        sc.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String nAgencia = sc.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Por Favor, digite o saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ nAgencia +", conta "+ nConta +" e seu saldo " + saldo +" já está disponível para saque.");
        sc.close();
    }
}
