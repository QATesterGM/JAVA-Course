package ModyfikatoryDostepu.model;

public class Car {

    private String mark;
    private int vintage;
    private int price;
    private int course;

    public Car(String mark, int vintage, int price, int course) {
        this.mark = mark;
        this.vintage = vintage;
        this.price = price;
        this.course = course;
    }

    public void showCarInfo() {
        System.out.println("Marka i model: " +  mark + ", Rocznik: " + vintage + ".r " + ", Cena " + price + "PLN" +
                ", Przebieg: " + course + "km");
    }

}
