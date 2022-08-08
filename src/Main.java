import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MagicBox<String> stringMagicBox = new MagicBox<>("null", 5);
        for (int i = 0; i < stringMagicBox.maxItems; i++) {
            System.out.println("¬ведите строку");
            String item = scanner.nextLine();
            stringMagicBox.add(item);
        }
        System.out.println(stringMagicBox.pick());

        MagicBox<Integer> integerMagicBox = new MagicBox<>(0, 5);
        for (int i = 0; i < integerMagicBox.maxItems; i++) {
            System.out.println("¬ведите число");
            int item = scanner.nextInt();
            integerMagicBox.add(item);
        }
        System.out.println(integerMagicBox.pick());
    }
}
