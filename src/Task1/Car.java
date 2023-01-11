package Task1;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountry(String country) {
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
