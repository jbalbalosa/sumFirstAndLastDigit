public class Main {
    public static void main(String[] args) {
        System.out.println("sumFirstAndLastDigit!");

        System.out.println(sumFirstAndLastDigit (252));
        System.out.println(sumFirstAndLastDigit (257));
        System.out.println(sumFirstAndLastDigit (0));
        System.out.println(sumFirstAndLastDigit (5));
        System.out.println(sumFirstAndLastDigit (-10));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }

        int sum = 0;
        int lastDigit = number % 10;
        int firstDigit = 0;

        while (number >= 10) {
            number /= 10;
        }
        firstDigit = number;
        sum = firstDigit + lastDigit;
        return sum;
    }


}
