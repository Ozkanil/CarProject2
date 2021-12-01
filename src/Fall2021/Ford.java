package Fall2021;

class Ford extends Car {


    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ford---> start engine";
    }

    @Override
    public String accelerate() {
        return "Ford---> accelerate";
    }

    @Override
    public String brake() {
        return "Ford---> brake";
    }
}

