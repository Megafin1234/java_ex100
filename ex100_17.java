import java.util.Scanner;
public class ex100_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("10진수를 입력하세요:");

        int decimalNumber = scanner.nextInt();
        System.out.printf("입력 받은 10진수를 16진수로 출력: %x\n", decimalNumber);
    }
}
