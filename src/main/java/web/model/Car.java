package web.model;


public class Car {
    private String name;
    private String model;
    private int yearOfRelease;

    public Car(String name, String model, int yearOfRelease) {
        this.name = name;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setData(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
}


