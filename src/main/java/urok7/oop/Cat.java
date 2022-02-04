package urok7.oop;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    public void eat(Plate p) {
        if (appetite <=p.getFood()) {
            p.decreaseFood(appetite);
            System.out.println("cat is not hungry");
            fullness = true;
        } else {
            System.out.println("cat is hungry");
        }

    }

    public int getAppetite() {
        return appetite;
    }

}
