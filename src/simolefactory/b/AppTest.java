package simolefactory.b;

/**
 * 根据a问题 服务器代码修改 客户端代码也要修改
 * 修改代码如下 使用简单工厂设计模式
 */

// 抽象产品
interface Food {

    void eat();
}

//具体商品
class Hamburger implements Food {

    @Override
    public void eat() {
        System.out.println("eat Hamburger");
    }
}

class RiceNoodle implements Food {

    @Override
    public void eat() {
        System.out.println("eat RiceNoodle");
    }
}

class FoodFactory {

    public static Food getFood(int n) {
        Food food = null;
        switch (n) {
            case 1:
                food = new Hamburger();
                break;
            case 2:
                food = new RiceNoodle();
                break;
        }
        return food;
    }
}

// ========================================
public class AppTest {

    public static void main(String[] atgs) {
        Food food = FoodFactory.getFood(2);

        food.eat();
    }
}

/*
简单工厂
    优点
    1. 把具体产品的类型 从客户端中 解耦出来
    2. 服务器 如果修改了具体产品类名 客户端也知道
    符合了 面向接口编程的思想

    缺点
    1. 客户端不得不硬背 常量（数字）与产品关系
    2. 如果具体产品特别多 简单工厂 就会变的很臃肿
    3. 最大的问题是 客户端需要扩展具体产品的时候 必要修改简单工厂中的代码 就违反了开闭原则
 */
