public class Example01 {
    private final String name;

    public Example01(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public synchronized void call(Example01 caller) {
        System.out.println(this.getName() + "has call me " + caller.getName());
    }

    public static void main(String[] args) {
        Example01 caller1 = new Example01("caller 1");
        Example01 caller2 = new Example01("caller 2");
        new Thread(new Runnable() {
            public void run() {
                caller1.call(caller1);
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                caller2.call(caller1);
            }
        }).start();
    }

}
