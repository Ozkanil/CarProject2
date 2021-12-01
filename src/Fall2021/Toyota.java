package Fall2021;

class Toyota extends Car {


    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+ "---> start engine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+"---> accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+"---> Brake";
    }
}

