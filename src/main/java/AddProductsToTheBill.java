import java.util.Scanner;

public class AddProductsToTheBill {
    public static Scanner scanner = new Scanner(System.in);

    public static void askTheBill() {
        int value = 0;
        System.out.println("На сколько человек разделить счет?");

        while (true) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();

                if (value > 0) {
                    break;
                } else {
                    System.out.println("Вы ввели отрицательное число, или ноль. Попробуйте снова. \nНа сколько человек разделить счет?");
                }
            } else {
                System.out.println("Введенное значение не int. Попробуйте еще раз. \nНа сколько человек разделить счет?");
                scanner.next();
            }
        }
        Calculator.numberOfPerson = value;
    }
}
