package week11;

import jdk.nashorn.api.tree.InstanceOfTree;

class A {
    
}

class B extends A{

}

class C {

}

public class asd{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Object c = new C();

        System.out.println(c instanceof B);
    }
}


