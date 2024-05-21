public class ClienteBanco {

    public static void main(String [] args){
        ContaTerminal contaTerminal = new ContaTerminal();

        contaTerminal.getNumero();
        contaTerminal.getAgencia();
        contaTerminal.getNomeCliente();
        contaTerminal.getSaldo();

        System.out.println("Olá " + contaTerminal.nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + contaTerminal.agencia + ", conta "
                + contaTerminal.numero + " e seu saldo " + contaTerminal.saldo +
                " já está disponível para saque.");
        
    }
}
