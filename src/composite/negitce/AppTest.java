package composite.negitce;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

class MySet extends HashSet {

    private int count = 0;

    @Override
    public boolean add(Object o) {
        count++;
        return super.add(o);
    }

    //    @Override
    //    public boolean addAll(Collection c) {
    //        count += c.size();
    //        return super.addAll(c);
    //    }


    @Override
    public boolean addAll(Collection c) {
        boolean modified = false;
        for (Object obj : c) {
            if (add(c)) {
                modified = true;
            }
        }
        return modified;
    }

    public int getCount() {
        return count;
    }

}

public class AppTest {

    public static void main(String[] args) {
        MySet set = new MySet();
        //        set.add("a");
        //        set.add("b");
        //        set.add("c");

        Set set2 = new HashSet();
        set2.add("1111");
        set2.add("2222");
        set2.add("3333");

        System.out.println(set2);

        set.addAll(set2);

        System.out.println(set.getCount());
    }
}

