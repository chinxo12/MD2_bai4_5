public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }
    public  void  start (){
        this.startTime = System.currentTimeMillis();
    }
    public void stop (){
        this.endTime = System.currentTimeMillis();
    }
    public double getElapsedTime() {
        double time = endTime - startTime;
        return time;
    }
}
