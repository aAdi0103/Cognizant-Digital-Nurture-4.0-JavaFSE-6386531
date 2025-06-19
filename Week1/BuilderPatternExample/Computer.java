public class Computer {
    private String cpu;
    private String memory;
    private String storageDrive;

    public Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.storageDrive = builder.storageDrive;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMemory() {
        return memory;
    }

    public String getStorageDrive() {
        return storageDrive;
    }

    @Override
    public String toString() {
        return "CPU: " + cpu + ", Memory: " + memory + ", Storage: " + storageDrive;
    }

    public static class Builder {
        String cpu;
        String memory;
        String storageDrive;

        public Builder withCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder withMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder withStorage(String storageDrive) {
            this.storageDrive = storageDrive;
            return this;
        }

        public Computer assemble() {
            return new Computer(this);
        }
    }
}
