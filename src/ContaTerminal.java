import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Por favor, digite o número da Agência: ");
        String agencia = input.nextLine();

        System.out.printf("Digite seu nome: ");
        String nomeCliente = input.nextLine();

        System.out.printf("Digite um valor inicial para deposito na conta:");
        double valorDeposito = input.nextDouble();

        Random random = new Random();
        int numeroConta = random.nextInt(1000) + 1;


        Conta novaConta = new Conta(numeroConta, agencia, nomeCliente, valorDeposito);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",novaConta.getNomeCliente(), novaConta.getAgencia(),novaConta.getNumero(),novaConta.getSaldo());


    }
}
