package BuilderPattern;

public class Main {
    public static void main(String[] args) {

        //objects are build very conveniently
        Computer computer1 = new Computer.ComputerBuilder()
                .setCompany("Lenovo")
                .setCores(10)
                .build();

        Computer computer2 = new Computer.ComputerBuilder()
                .setCpu("Intel")
                .setRam(16)
                .setStorage(512)
                .build();


    }
}
