public class Calculator {

    public static int add(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        return sum;
    }

    public static int multiply(int... numbers){

        int product = 1;

        for (int j = 0; j < numbers.length ; j++) {
            product = product * numbers[j];

        }
        return product;
    }

    public static void main(String[] args) {

        System.out.println(add(3,4,5));
        System.out.println(multiply(4,5));

    }

}
