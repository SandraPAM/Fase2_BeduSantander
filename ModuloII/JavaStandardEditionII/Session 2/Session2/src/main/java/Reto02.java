import java.util.concurrent.TimeUnit;

class MiHilo01 implements Runnable{

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

class MiHilo02 implements Runnable{
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


public class Reto02 extends Thread{

    public static void main(String[] args) {
        MiHilo01 run1 = new MiHilo01();
        MiHilo02 run2 = new MiHilo02();

        Thread t1 = new Thread(run1);
        //t1.setDaemon(true);
        t1.start();

        Thread t2 = new Thread(run2);
        //t2.setDaemon(true);
        t2.start();
    }
}
