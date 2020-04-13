package demerter.negitce;

class Computer {

    public void saveDate() {
        System.out.println("saveDate");
    }

    public void killProcess() {
        System.out.println("killProcess");
    }

    public void closeScreen() {
        System.out.println("closeScreen");
    }

    public void powerOff() {
        System.out.println("powerOff");
    }
}

class Person {

    private Computer c = new Computer();


    public void shutdownComputer() {
        // 知道太多了
        c.saveDate();
        c.killProcess();
        c.closeScreen();
        c.powerOff();
    }
}

public class AppTest {

}

