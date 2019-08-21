import ThreadIntro.DeadLockSituation;
import ThreadIntro.FirstRunnable;
import ThreadIntro.RaceCondition;

public class Driver {

    public static void main(String[] args) throws InterruptedException {
//        FirstRunnable first = new FirstRunnable();
//        first.driveMe();

//        RaceCondition raceCondition = new RaceCondition();
//        raceCondition.beginRace();

        DeadLockSituation deadLockSituation = new DeadLockSituation();
        deadLockSituation.createDeadlock();
    }
}
