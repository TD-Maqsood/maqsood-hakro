interface Interf {
    int i = 3;
    public void m1();

    public void m2();
}


class ServiceProvider implements Interf {

    @Override
    public void m1() {
        System.out.println("Hello i am m1 "+ i);
    }

    @Override
    public void m2() {
        System.out.println("hello i am m2");
    }
}

class DurgaSir {
    public static void main(String args[]) {


        ServiceProvider serviceProvider = new ServiceProvider();
        serviceProvider.m1();
        serviceProvider.m2();


    }
}
