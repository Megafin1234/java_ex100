import java.util.Scanner;
public class ex100_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 정수 a와 b를 입력하세요:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b >= a) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
