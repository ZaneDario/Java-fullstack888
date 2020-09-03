package Ex3.Brands.Mercedes;
import Ex3.Car;

public class Mercedes extends Car {

    public Mercedes(String licensePlate, int horsepower) {
        super(licensePlate,"Mercedes", horsepower);
    }

    @Override
    public void start() {
        started = true;
        System.out.println("Starting by pressing a button.");
    }

    @Override
    public void stop() {
        started = false;
        System.out.println("Stopping by pressing a button.");
    }
}