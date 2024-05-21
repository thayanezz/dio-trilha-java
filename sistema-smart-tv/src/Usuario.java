public class Usuario {
    public static void main(String[] args)  throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Volume atual: "+ smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual:" + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual? " + smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(14);
        
        smartTv.ligar();
        System.out.println("Novo status. Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status. Desligada? " + smartTv.ligada);
    }
}
