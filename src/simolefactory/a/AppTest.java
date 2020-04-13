package simolefactory.a;

/**
 * 作者
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

// ========================================
public class AppTest {

    public static void main(String[] atgs) {
        Food f = new Hamburger();
        f.eat();
    }
}

/*
 设计脆弱
 原因； 只要作者修改产品类名 客户端代码也要改变 服务器端和客户端呈耦合
 希望效果； 如论服务器端咋修改 都不用改变客户端
 */
