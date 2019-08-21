package ThreadIntro;

public class RaceCondition {

    public void beginRace() throws InterruptedException {
        LongWrapper longWrapper = new LongWrapper(0L);

        Runnable r = ()->{

            for(int i=0;i<1000;i++){
                longWrapper.incrementValue();
            }
        };
        Thread t[] = new Thread[1000];
        for(int i=0;i<1000;i++){
            t[i] = new Thread(r);
            t[i].start();
        }

        for(int i=0;i<1000;i++){
            t[i].join();
        }

        System.out.println("value: "+longWrapper.getValue());
    }
}
