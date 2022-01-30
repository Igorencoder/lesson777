package urok7.oop;

public class MainClass {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 30);
        Plate plate = new Plate(100);
        plate.info();
        int n = plate.getFood();

        cat.eat(plate);
        if (plate.getFood() < 0)
        { System.out.println("Fill in the plate");}
        else {
            plate.info();
        }
        /**  ---ниже пополение тарелки
         *
         */
        plate.getFood();
        System.out.println("n=" + n + " " + plate.getFood());
        if (plate.getFood()<n) {
            plate.setFood(n);

        }  plate.info();
        // ниже массив котов
        Cat [] cats = new Cat[5];
        for (int i = 0; i<cats.length; i++) {
            cats[i] = new Cat("Tuzik" + i, 30);
            cats[i].eat(plate);
            plate.info();
        }


    }

}
