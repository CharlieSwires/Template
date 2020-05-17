
public class Coffee extends CaffineBeverage {

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");


    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");

    }

}
