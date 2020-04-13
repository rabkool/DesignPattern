package interfaceisolation.negitce;

public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }

    @Override
    public void fly() {
        throw new RuntimeException("Cant fly");
    }
}
