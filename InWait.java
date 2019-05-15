package SmallFireStation;

public class InWait implements Runnable {

    private Call call;

    public InWait(Call call) {
        this.call = call;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (call){
            try {
                System.out.println(name+" in waiting for call");
                call.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name+call.getMsg());
            System.out.println(name+" starts working");

        }
    }
}
