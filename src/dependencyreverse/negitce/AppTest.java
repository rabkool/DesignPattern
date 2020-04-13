package dependencyreverse.negitce;

/**
 * Demo class
 *
 * @author Yin
 * @date 2020/04/09
 */

class Person {

    public void feed(Dog dog) {
        System.out.println("开始");
        dog.eat();
    }

    public void feed(Cat cat) {
        System.out.println("开始");
        cat.eat();
    }
}

class Dog {

    public void eat() {
        System.out.println("eat");
    }
}

class Cat {

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
// 违反 依赖倒置  下层变动时 上层也要修改 (上层代码不应改 没扩展性)