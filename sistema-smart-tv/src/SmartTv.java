/**
 * <h1>SmartTv</h1>
 * A SmartTv realiza processos de uma televisão
 * <p>
 * <b>Note: </b> Leia atentamente os recursos desta classe
 * para desfrutar dos recursos oferecidos pelo autor
 * @author Thayane Santos
 * @version 1.0
 * @since 10/05/2024
 */
public class SmartTv {

    boolean ligada = false;
    int canal=10;
    int volume= 25;

    public void ligar(){
        ligada=true;
        
    }
    public void desligar(){
        ligada=false;

    }
    public void aumentarVolume(){
        volume++;

    }
    public void diminuirVolume(){
        volume--;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    /**
     * Este método é utilizado para mudar de canal
     * @param novoCanal especifica o canal
     */
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Novo canal: "+ canal);;
    }
}