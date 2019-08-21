package ThreadIntro;

public class LongWrapper {

    private long l;
    private Object key = new Object();

    public LongWrapper(long l){
        this.l = l;
    }

    public long getValue(){
        return l;
    }

    public synchronized void incrementValue(){
            l=l+=1;
    }
}
