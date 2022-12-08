package it.DevelHope.ExerciseJava8;

public class Tester {
    public static void main(String[] args) {
        SmartphonePrice producer1 = new SmartphonePrice("Euro", 700.00);
        SmartphonePrice producer2 = new SmartphonePrice("Euro", 500.00);
        SmartphonePrice retail1 = new SmartphonePrice("Euro", 1000.00);
        SmartphonePrice retail2 = new SmartphonePrice("Euro", 800.00);

        Smartphone smartphone1 = new Smartphone("Apple","IphoneX",2716, producer1, retail1);
        Smartphone smartphone2 = new Smartphone("Android","Galaxy S21",4000, producer2, retail2);

        System.out.println(smartphone1);
        System.out.println("---------");
        System.out.println(smartphone2);
        System.out.println("---------");
        System.out.println("Is 'IphoneX' equals to 'GalaxyS21'? " + "\n" + smartphone1.equals(smartphone2));
        System.out.println("---------");

        try {
            Smartphone clonedAndroidS21 = smartphone2.clone();
            System.out.println("--CLONED SMARTPHONE--\n" + clonedAndroidS21);
            System.out.println("---------");
            System.out.println("Is 'CLONED AndroidS21' equals to 'ORIGINAL AndroidS21?' " + "\n" + clonedAndroidS21.equals(smartphone2));
        }
        catch (Exception e){
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}
