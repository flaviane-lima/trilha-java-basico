public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //metodo para a televisão  ligada
    public void ligar(){
        ligada = true;
    }
    //metodo para a televisão desligada
    public void  desligar(){
        ligada = false;
    }

    //metodo aumentando volume
    public void aumentarVolume(){
        //volume = volume + 1: seria a mesma forma igual abaixo
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    //metodo diminuindo volume
    public void diminuirVolume(){
        //volume = volume - 1: seria a mesma forma igual abaixo
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    //metodo para mudar canal
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

}
