package demerter.positive;

class Computer {

    private void saveDate() {
        System.out.println("saveDate");
    }

    private void killProcess() {
        System.out.println("killProcess");
    }

    private void closeScreen() {
        System.out.println("closeScreen");
    }

    private void powerOff() {
        System.out.println("powerOff");
    }

    public void shutDown() {
        saveDate();
        killProcess();
        closeScreen();
        powerOff();
    }
}

class Person {

    private Computer c = new Computer();


    public void shutdownComputer() {
        c.shutDown();
    }
}

public class AppTest {

}

