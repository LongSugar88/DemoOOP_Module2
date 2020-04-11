public class StopWatch {
    private long startTime,endTime;


    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        double elapsed = this.endTime - this.startTime;
        elapsed = elapsed/1000;
        return elapsed;
    }
}

class testWatch {
    public static void main(String[] args) {
        StopWatch myWatch = new StopWatch();
        QuadraticEquation myEqua = new QuadraticEquation();
        myEqua.getA();
        myEqua.getB();
        myEqua.getC();
        myWatch.start();
        System.out.println(myEqua.getRoot());
        myWatch.stop();
        System.out.printf("Time to get Root is : %.3fs",myWatch.getElapsedTime());
    }
}
