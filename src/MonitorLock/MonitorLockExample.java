package MonitorLock;

public class MonitorLockExample {

    public synchronized void task1(){
        // do something
        try {
            System.out.println("inside task1");
            Thread.sleep(10000);
            System.out.println("task1 completed");
        }
        catch(Exception e){
            // exception handling here
        }
    }

    public  void task2() {
        System.out.println("task2, but before synchronized");
        double first = System.currentTimeMillis();
        synchronized (this){
            System.out.println("TIme taken " + (System.currentTimeMillis() - first));
            System.out.println("task2, inside synchronized");
        }
    }

    public void task3(){
        System.out.println("task3");
    }

}
