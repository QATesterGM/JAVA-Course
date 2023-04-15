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

    public String getMark() {
        return mark;
    }

    public int getVintage() {
        return vintage;
    }

    public int getCourse() {
        return course;
    }

    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        if (price <= 1000) {
            System.out.println("Price is to low");
        } else {
            this.price = price;
        }
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setVintage(int vintage) {
        this.vintage = vintage;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void showCarInfo() {
        System.out.println("Marka i model: " + mark + ", Rocznik: " + vintage + ".r " + ", Cena " + price + "PLN" +
                ", Przebieg: " + course + "km");
    }

}
