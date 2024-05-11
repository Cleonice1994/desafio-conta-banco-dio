import java.math.BigDecimal;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Nome Cliente");
        String nome = scanner.next();

        System.out.println("Conta");
        int conta = scanner.nextInt();

        System.out.println("Agencia");
        String agencia = scanner.next();

        System.out.println("Saldo: ");
        BigDecimal saldo = scanner.nextBigDecimal();


        

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ conta +" e seu saldo " + saldo +" já está disponível para saque.");
        
        


    }
}
