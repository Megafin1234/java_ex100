import java.util.Scanner;

public class ex100_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("실수를 입력하세요:");
        float num = scanner.nextFloat();
        float roundedNum = Math.round(num * 1000.0f) / 1000.0f;
        System.out.printf("입력한 실수를 소수점 이하 3째 자리에서 반올림하여 2째 자리까지 출력: %.2f\n", roundedNum);
    }
}