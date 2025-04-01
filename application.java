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
    #feature202 changes by vivek on october 2024 on reports modules
    public class Example {
        public static void main(String[] args) {
            sum(3, 5);
           
            int number1 = 2;
            int number2 = 4;
           
            sum(number1, number2);       
        }
       
        public static void sum(int first, int second) {
            System.out.println("" + first + " + " + second + " = " + (first+ second));
        }
    }
}
feature202 code end here
