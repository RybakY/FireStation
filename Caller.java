package SmallFireStation;

public class Caller implements Runnable {

    private Call call;

    public Caller(Call call) {
        this.call = call;
    }

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        System.out.println(name+" is online");
        try {
            Thread.sleep(1500);
            synchronized (call){
                call.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
