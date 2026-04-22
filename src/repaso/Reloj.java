package repaso;

public class Reloj {
    private long time = 0;

    public long getTime() {
        return this.time;
    }

    public void setTime(long theTime) {
        this.time = theTime;
    }

    public Reloj(long time) {
        this.time = time;
    }

    
    public static class ClockReader {
        
        Reloj clock = new Reloj(0); 

        public long readClock() { 
            return clock.getTime(); 
        }
    }
}