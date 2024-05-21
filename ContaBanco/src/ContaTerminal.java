import java.util.Scanner;

public class ContaTerminal{
    
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;
    
    Scanner scanner = new Scanner(System.in);

    public int getNumero() {
        System.out.println("Digite o número da conta: ");
        this.numero = scanner.nextInt();
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        System.out.println("Digite o número da agência vinculada à conta: ");
        this.agencia = scanner.next();

        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNomeCliente() {
        System.out.println("Digite o nome do cliente: ");
        this.nomeCliente = scanner.next();

        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public double getSaldo() {
        System.out.println("Digite o saldo da conta: ");
        this.saldo = scanner.nextDouble();
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

