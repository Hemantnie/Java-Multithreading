package ThreadIntro;

public class FirstRunnable {

    public void driveMe(){

        Runnable runnable = ()->{
            System.out.println("I am running in "+ Thread.currentThread().getName());
        };

        Thread t = new Thread(runnable);
        t.start();
    }
}
