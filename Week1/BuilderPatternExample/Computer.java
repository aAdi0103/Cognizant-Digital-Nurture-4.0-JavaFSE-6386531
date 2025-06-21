public class Computer {
    private String CPU;
    private String RAM;
    private String Storage;

    public Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
    }

    public String getCPU() {
        return CPU;
    }
    public String getRAM() {
        return RAM;
    }
    public String getStorage() {
        return Storage;
    }
    @Override
    public String toString() {
        return "CPU: " + CPU + ", RAM: " + RAM + ", Storage: " + Storage;
    }

    public static class Builder {
        String CPU;
        String RAM;
        String Storage;
        public Builder withCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
  public Builder withMemory(String RAM) {
            this.RAM = RAM;
            return this;
        }
        public Builder withStorage(String Storage) {
            this.Storage = Storage;
            return this;
        }
 public Computer assemble() {
            return new Computer(this);
        }
    }
}
