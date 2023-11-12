import java.util.Scanner;
public class ex100_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 두 개를 입력하세요 (0 <= a, b <= 10):");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = a * (int) Math.pow(2, b);
        System.out.println("a에 2의 b승을 곱한 결과: " + result);
    }
}
