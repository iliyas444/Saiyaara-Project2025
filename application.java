public class Calculator {

    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void add(int number) {
        this.value = this.value + number;
    }

    public void subtract(int number) {
        this.value = this.value + number;
    }

    public int getValue() {
        return this.value;
    }
  #feature201 changes by Ethan on oct 2024 on reports modules
  import java.util.Scanner;

public class ProgramStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // program code
        System.out.println("Let`s try if we can travel to the method world:");
        greet();

        System.out.println("Looks like we can, let`s try again::");
        greet();
        greet();
        greet();
    }

    // omat metodit
    public static void greet() {
        System.out.println("Greetings from the method world!");
    }
}

}
end of feature202
