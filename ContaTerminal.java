import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner ContaTerminal = new Scanner(System.in);
         System.out.println("Digite sua agência ");
         String agencia = ContaTerminal.nextLine();
         

        String nome = args [0];
        String sobrenome = args[1];
        int conta = Integer.valueOf (args[2]);
        double saldo = Double.valueOf(args[3]);

        System.out.println("Olá" + nome + " " + sobrenome);
        System.out.println("obrigado por criar uma conta em nosso banco ");
        System.out.println( "Sua agência é: " + agencia);
        System.out.println( "conta: " + conta);
        System.out.println("seu saldo: " + saldo + "já pode ser sacado");
         

        
        
        
        
         


        
    }
}
