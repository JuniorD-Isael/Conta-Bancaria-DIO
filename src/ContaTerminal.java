import com.contaterminal.entities.Conta;

import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        // TODO: Conhecer e importar a classe Scanner

        Scanner sc = new Scanner(System.in);

        // Exibir as mensagem para o nosso usuario e obter pela scanner os valores digitados no terminal

        System.out.println("Digite o seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Agora o numero da sua agencia: ");
        String agencia = sc.nextLine();

        System.out.println("Numero da conta: ");
        int numero = sc.nextInt();

        System.out.println("Saldo: ");
        double saldo = sc.nextDouble();


        Conta conta = new Conta(numero, agencia, nomeCliente, saldo);

        // Exibir a mensagem conta criada
        System.out.println(conta.toString());
    }
}