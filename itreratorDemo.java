import java.util.ArrayList;
import java.util.Iterator;

public class itreratorDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        for (int i =0; i<10;i++)
        {
            al.add(i);
        }
        Iterator itr = al.iterator();
        while (itr.hasNext())
        {
            int i = (Integer) itr.next();
            System.out.println(i + " ");
        }
       /* {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        }*/
    }
}
