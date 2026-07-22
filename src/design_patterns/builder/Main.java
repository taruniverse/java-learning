package design_patterns.builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("Intel i5", "16GB")
                .storage("512GB SSD")
                .graphicsCard("NVIDIA RTX")
                .build();

        System.out.println(computer);
    }
}

class Computer {
    private final String cpu;
    private final String ram;
    private final String storage;
    private final String graphicsCard;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    public String toString() {
        return "Computer{cpu='" + cpu + "', ram='" + ram + "', storage='" + storage
                + "', graphicsCard='" + graphicsCard + "'}";
    }

    static class Builder {
        private final String cpu;
        private final String ram;
        private String storage = "No storage";
        private String graphicsCard = "Integrated graphics";

        Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        Builder graphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        Computer build() {
            return new Computer(this);
        }
    }
}

