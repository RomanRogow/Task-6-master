package web.model;

public class Car {
   private String model;
   private String series;
   private int serialNumber;

   public Car(){}

    public Car(String model, String series, int serialNumber) {
        this.model = model;
        this.series = series;
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}
