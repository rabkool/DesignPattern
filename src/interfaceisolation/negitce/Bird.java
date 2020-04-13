package interfaceisolation.negitce;

public class Bird implements Animal{

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void swim() {
        throw new RuntimeException("you can you up");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
