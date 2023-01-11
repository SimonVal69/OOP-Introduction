package Task2;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Автомобиль{" +
                "марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", объём двигателя=" + engineVolume +
                ", цвет='" + color + '\'' +
                ", год выпуска=" + year +
                ", страна='" + country + '\'' +
                '}';
    }
}
