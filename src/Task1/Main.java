package Task1;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setBrand("Lada");
        car1.setModel("Granta");
        car1.setEngineVolume(1.7);
        car1.setColor("жёлтый");
        car1.setYear(2015);
        car1.setCountry("Россия");

        Car car2 = new Car();
        car2.setBrand("Audi");
        car2.setModel("A8 50 L TDI quattro");
        car2.setEngineVolume(3.0);
        car2.setColor("черный");
        car2.setYear(2020);
        car2.setCountry("Германия");

        Car car3 = new Car();
        car3.setBrand("BMW");
        car3.setModel("Z8");
        car3.setEngineVolume(3.0);
        car3.setColor("черный");
        car3.setYear(2021);
        car3.setCountry("Германия");

        Car car4 = new Car();
        car4.setBrand("Kia");
        car4.setModel("Sportage 4-го поколения");
        car4.setEngineVolume(2.4);
        car4.setColor("красный");
        car4.setYear(2018);
        car4.setCountry("Южная Корея");

        Car car5 = new Car();
        car5.setBrand("Hyundai");
        car5.setModel("Avante");
        car5.setEngineVolume(1.6);
        car5.setColor("оранжевый");
        car5.setYear(2016);
        car5.setCountry("Южная Корея");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}