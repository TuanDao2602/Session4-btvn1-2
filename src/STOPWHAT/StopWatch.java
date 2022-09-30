package STOPWHAT;

public class StopWatch {
    private long starTime;
    private long endTime;

    public long getStarTime() {
        return starTime;
    }

    public StopWatch() {
        this.starTime =System.currentTimeMillis();
    }

    public long getEndTime() {
        return endTime;
    }

    public void start(){
        this.starTime=System.currentTimeMillis();
    }
    public void stop(){
        this.endTime =System.currentTimeMillis();
    }
    public long getElaspedTime(){
        long time = this.endTime-this.starTime;
        return time;
    }

}
