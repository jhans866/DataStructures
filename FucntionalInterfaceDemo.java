public class FucntionalInterfaceDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread created");
            }
        }).start();

        new Thread (()->{System.out.println("New Thread created");}).start();
    }
}
