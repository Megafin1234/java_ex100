import java.util.Scanner;
public class ex100_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 정수 a와 b를 입력하세요:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}
