class Computer {
    private String cpu;
    private String memory;
    private String hdd;
    private String color;
    private String power;

    public Computer(String cpu, String memory, String hdd, String color, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hdd = hdd;
        this.color = color;
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Turning on the computer.");
    }

    public void printInfo() {
        System.out.println("CPU: " + this.cpu);
        System.out.println("Memory: " + this.memory);
        System.out.println("HDD: " + this.hdd);
        System.out.println("Color: " + this.color);
        System.out.println("Power: " + this.power);
    }
}

class Monitor {
    private String size;
    private String color;
    private String power;

    public Monitor(String size, String color, String power) {
        this.size = size;
        this.color = color;
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }

    public void printInfo() {
        System.out.println("Size: " + this.size);
        System.out.println("Color: " + this.color);
        System.out.println("Power: " + this.power);
    }
}

class PersonalComputer {
    private Computer computer;
    private Monitor monitor;

    public PersonalComputer() {
        this.computer = new Computer("Core i7", "16GB", "2TB", "White", "500W");
        this.monitor = new Monitor("24 inch", "Black", "45W");
    }

    public void turnOn() {
        computer.turnOn();
        monitor.turnOn();
    }

    public void printInfo() {
        System.out.println("The spec of the computer");
        computer.printInfo();
        System.out.println("The spec of the monitor");
        monitor.printInfo();
    }
}

public class Homework5 {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer();
        pc.turnOn();
        pc.printInfo();
    }
}
