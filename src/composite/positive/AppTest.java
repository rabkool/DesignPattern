package composite.positive;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

class MySet {

    private HashSet set = new HashSet();

    private int count = 0;

    public boolean add(Object o) {
        count++;
        return set.add(o);
    }

    public boolean addAll(Collection c) {
        count += c.size();
        return set.addAll(c);
    }

    public int getCount() {
        return count;
    }

}

public class AppTest {

    public static void main(String[] args) {
        MySet set = new MySet();

        Set set2 = new HashSet();
        set2.add("1111");
        set2.add("2222");
        set2.add("3333");

        set.addAll(set2);

        set.add("444");
        System.out.println(set.getCount());
    }
}

