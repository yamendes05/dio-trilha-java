import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;
          System.out.println("Por favor, digite o número da Agência: ");
          numero = ler.nextInt();
          System.out.println("Por favor,digite a Agência: ");
          agencia = ler.next();
          System.out.println("Por favor, digite o seu nome: ");
          nomeCliente = ler.next();
          System.out.println("Por favor, digite o saldo: ");
          saldo = ler.nextDouble();
          
          System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo "+ saldo + " já está disponível para saque");
}
}