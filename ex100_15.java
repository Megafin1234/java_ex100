import java.util.Scanner;

public class ex100_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("년을 입력하세요:");
        int year = scanner.nextInt();
        System.out.println("월을 입력하세요:");
        int month = scanner.nextInt();
        System.out.println("일을 입력하세요:");
        int day = scanner.nextInt();

        System.out.printf("%d.%02d.%02d\n", year, month, day);

    }
}