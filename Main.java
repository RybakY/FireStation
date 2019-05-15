package SmallFireStation;

public class Main {
    public static void main(String[] args) throws InterruptedException {

    System.out.println("***all start***");

    Call call = new Call(" is called");
    Thread.currentThread().setPriority(10);

    Caller Caller = new Caller(call);
    Thread caller = new Thread(Caller,"Operator");
    caller.start();

    InWait inWait = new InWait(call);
    Thread thread1 = new Thread(inWait, "Fire Station");
    thread1.start();




    }
}
