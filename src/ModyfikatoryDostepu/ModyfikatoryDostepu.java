package ModyfikatoryDostepu;

import ModyfikatoryDostepu.model.Car;

public class ModyfikatoryDostepu {

    public static void main(String[] args){

        Car pierwszaFura = new Car("Volkswagen Polo", 100000, 60000, 80000);
        pierwszaFura.showCarInfo();

        pierwszaFura.setPrice(1001);
        pierwszaFura.showCarInfo();

        System.out.println(pierwszaFura.getPrice());

    }
}
