package dependencyreverse.positive;

/**
 * Demo class
 *
 * @author Yin
 * @date 2020/04/09
 */

class Person {

    public void feed(Animal a) {
        System.out.println("开始");
        a.eat();
    }
}

class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("dog eat");
    }
}

class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("cat eat");
    }
}

public class AppTest {

    public static void main(String[] args) {
        Person p = new Person();
        Dog d = new Dog();
        Cat c = new Cat();

        p.feed(d);
        p.feed(c);
    }
}