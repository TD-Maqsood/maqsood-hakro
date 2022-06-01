public interface Bank extends Government {
    float rateOfInterest();
}


class SBI implements Bank {
    @Override
    public float rateOfInterest() {
        return 9.5F;
    }

    @Override
    public void policy() {
        System.out.println("Hello , this is policy from SBI");
    }

}

class PNB implements Bank {
    @Override
    public float rateOfInterest() {

        return 10.6F;
    }

    @Override
    public void policy() {

        System.out.println("Hello, this is policy from PNB");
    }
}

class TestInterface {
    public static void main(String args[]) {

        Bank bank = new PNB();

        System.out.println("Interest Rate: " + bank.rateOfInterest());
        bank.policy();

    }
}
