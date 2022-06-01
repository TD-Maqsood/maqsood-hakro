abstract class A { // Abstract class

    public abstract void m1();
    public abstract void m2();

}

public abstract class B extends A{
    public void m1(){
        System.out.println("Hello i am m1 method in B class");
    }

}

