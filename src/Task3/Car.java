package Task3;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand.equals("") || brand.trim().equals("")) {
            this.brand = "default";
        } else this.brand = brand;
        if (model == null || model.equals("") || model.trim().equals("")) {
            this.model = "default";
        } else this.model = model;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;
        if (color == null || color.equals("") || color.trim().equals("")) {
            this.color = "белый";
        } else this.color = color;
        if (year <= 0) {
            this.year = 2000;
        } else this.year = year;
        if (country == null || country.equals("") || country.trim().equals("")) {
            this.country = "default";
        } else this.country = country;
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
