package interfaceisolation.positive;

public class Dog implements Eatable, Swimable {

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }
}
