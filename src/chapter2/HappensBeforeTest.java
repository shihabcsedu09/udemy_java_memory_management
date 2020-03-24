package chapter2;

import java.util.concurrent.TimeUnit;

class HappensBeforeTest {
    private static volatile boolean stopRequested;

    public static void main(String[] args)
            throws InterruptedException {

        Thread backgroundThread = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (!stopRequested)
                    System.out.println("Stop Requested is : " + stopRequested);
                    i++;
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;

        System.out.println("Stop requested is set to : " + stopRequested);
    }
}

