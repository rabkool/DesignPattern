## Java

#### 依赖
B 作为 A的局部变量 

``` java
class A {

}

class B {
  void abc() {
    A a = new A();
  }
}
```


#### 关联
B 作为 A的字段
 - 俱合: 关系弱 (空心菱形)
 - 组合: 关系强 (实心菱形)
``` java
class A {

}

class B {
  A a = new A();
  void abc() {
  
  }
}
```


#### 继承/泛化
父类具体化一个子类

``` java
class A {

}

class B extends A{

}
```