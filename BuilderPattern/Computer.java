package BuilderPattern;

public class Computer {
    //has lot of fields, some customers initialise all, some initialise a few,
    private String company;
    private String cpu;
    private int cores;
    private int ram;
    private int storage;

    //so that its compulsory to use the builder class
    private Computer(ComputerBuilder builder){
        this.company = builder.company;
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.cores = builder.cores;
        this.storage = builder.storage;
    }

    //build the object and give it to the constructor
    public static class ComputerBuilder{
        private String company;
        private String cpu;
        private int cores;
        private int ram;
        private int storage;

        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this; // Returns the builder for method chaining
        }

        public ComputerBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setCores(int cores){
            this.cores = cores;
            return this;
        }

        public ComputerBuilder setCompany(String company){
            this.company = company;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
