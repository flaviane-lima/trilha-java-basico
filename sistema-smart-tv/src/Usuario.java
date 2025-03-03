public class Usuario {

    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada :? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal );
        System.out.println("Volume Atual :" + smartTv.volume);

        //chamando o metodo ligando
        smartTv.ligar();

        System.out.println("Novo Status -> TV ligada? :" + smartTv.ligada);

        //chamando o metodo desligando
        smartTv.desligar();

        System.out.println("Novo Status -> TV ligada? :" + smartTv.ligada);

        //chamando metodo aumentando e diminuindo
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume Atual :" + smartTv.volume);

        //chamando metodo canal
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal );





    }
}