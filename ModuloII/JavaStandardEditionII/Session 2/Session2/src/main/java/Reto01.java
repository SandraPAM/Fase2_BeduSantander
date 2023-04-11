import java.util.concurrent.TimeUnit;


class MiHilo1 extends Thread{

    @Override
    public void run(){
        for (int i = 1; i < 11; i++){
            System.out.println("Hilo1: " + i);
            try{
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}

class MiHilo2 extends Thread{
    @Override
    public void run(){
        for (int i = 1; i < 11; i++){
            System.out.println("Hilo2: Sigo en ejecucion");
            try{
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}


public class Reto01 extends Thread{

    public static void main(String[] args) {
        MiHilo1 hilo1 = new MiHilo1();
        MiHilo2 hilo2 = new MiHilo2();

        hilo1.setDaemon(true);

        hilo1.start();
        hilo2.start();

    }
}
