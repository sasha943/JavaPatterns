package patterns.builder;

/*
* Builder pattern used for creation some specific object
*
* */
public class BuilderExample {

    public static void main(String[] args) {
        Director director = new Director();
        ComputerBuilder cheapComputerBuilder = new CheapComputerBuilder();

        director.setComputerBuilder(cheapComputerBuilder);
        director.constructComputer();

        Computer computer = director.getComputer();
    }
}
