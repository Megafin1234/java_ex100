import java.util.Scanner;

public class ex100_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시를 입력하세요:");
        int hour = scanner.nextInt();
        System.out.println("분을 입력하세요:");
        int minute = scanner.nextInt();

        System.out.printf("입력받은 시간을 \"시:분\"으로 출력: %d:%d\n", hour, minute);

    }
}