package openClose.negtice;

public class AppTest {

    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("宝马");
        car.setColor("黑色");
        car.setPrice(9999999);
        car.setLouyou(true);

        System.out.println(car.getPrice());
    }
}
