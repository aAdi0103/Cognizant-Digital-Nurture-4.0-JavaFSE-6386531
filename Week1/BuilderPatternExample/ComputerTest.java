public class ComputerTest {
    public static void main(String[] args) {
        Computer computer1 = new Computer.Builder()
                .withCpu("Ryzen 5")
                .withMemory("16GB")
                .withStorage("512GB")
                .assemble();

        System.out.println("Computer1 specification:\n" + computer1);

        Computer computer2 = new Computer.Builder()
                .withCpu("Intel i5")
                .withMemory("8GB")
                .withStorage("512GB")
                .assemble();

        System.out.println("Computer2 specification:\n" + computer2);
    }
}
