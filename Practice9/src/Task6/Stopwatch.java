package Task6;
public class Stopwatch {
    private long startTime;
    private long endTime;

    public Stopwatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        Stopwatch sw = new Stopwatch();

        sw.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sw.stop();
        System.out.println("Прошедшее время в миллисекундах: " + sw.getElapsedTime());
    }
}