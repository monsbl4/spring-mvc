package web.model;

public class Car {
    public String carBrand;
    public String model;
    public String color;

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String carBrand, String model, String color) {
        this.carBrand = carBrand;
        this.model = model;
        this.color = color;
    }
}
