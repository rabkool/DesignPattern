package interfaceisolation.positive;

public class Bird implements Eatable, Flyable {

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}