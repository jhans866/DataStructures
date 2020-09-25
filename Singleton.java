public class Singleton {
    private static Singleton inst = null;
    public String s;
    private Singleton ()
    {
        s= "Hi";
    }
    public static Singleton getInstance()
    {
        if (inst == null)
        {
            synchronized (Singleton.class){
                if (inst == null)
                {
                    inst = new Singleton();
                }

            }

        }
        return inst;
    }
    public static void main(String[] args) {
      /*  Singleton st = new Singleton.getInstance();
        System.out.println(st);

        Singleton st1 = new Singleton.getInstance();
        System.out.println(st1);*/
        System.out.println("Hi Singleton");
    }
}
