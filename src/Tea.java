
public class Tea extends CaffineBeverage {

    @Override
    public void brew() {
        System.out.println("Steeping the tea");

    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");

    }

}
