import java.util.Scanner;

public class Palidrom {

    static boolean isPalindrom(int num) {
        int tempNumber = num, reverseNumber = 0, lastNumber;
        while (tempNumber != 0) {
            System.out.println("=========");
            lastNumber = tempNumber % 10;
            System.out.println("Last Number : " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Reverse Number : " + reverseNumber);
            tempNumber /= 10;
            System.out.println("New tempNumber : " + tempNumber);
            System.out.println("=========");
        }
        if (num == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(14341));

    }
}
