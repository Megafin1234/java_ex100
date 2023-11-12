import java.util.Scanner;
public class ex100_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 세 개를 입력하세요:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;
        double average = (double) sum / 3;

        System.out.println("입력 받은 정수 세 개의 합: " + sum);
        System.out.printf("입력 받은 정수 세 개의 평균: %.1f\n", average);
    }
}
