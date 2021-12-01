package Fall2021;

public class Main {

    public static void main(String[] args) {

        Car car =new Car("Private car", 6);
        System.out.println(car.accelerate());
        System.out.println(car.startEngine());
        System.out.println(car.brake());

        Tesla tesla= new Tesla("Tesla", 6);
        System.out.println(tesla.accelerate());
        System.out.println(tesla.startEngine());
        System.out.println(tesla.brake());

        Ford ford= new Ford ("Ford", 6);
        System.out.println(ford.accelerate());
        System.out.println(ford.startEngine());
        System.out.println(ford.brake());

        Toyota toyota= new Toyota ("Toyota", 6);
        System.out.println(toyota.accelerate());
        System.out.println(toyota.startEngine());
        System.out.println(toyota.brake());

    }
}

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine(){

        return "Car---> start engine";
    }
    public String accelerate() {
        return "Car---> accelerate";
    }

    public String brake(){
        return "Car---> Brake";
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }}

class Tesla extends Car {


    public Tesla(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Tesla---> start engine";
    }

    @Override
    public String accelerate() {
        return "Tesla---> accelerate";
    }

    @Override
    public String brake() {
        return "Tesla---> Brake";
    }
}

