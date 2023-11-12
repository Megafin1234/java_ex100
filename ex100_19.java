import java.util.Scanner;
public class ex100_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("10진수를 입력하세요 (0 ~ 255 범위):");
        int decimalNumber = scanner.nextInt();

        if (decimalNumber >= 0 && decimalNumber <= 255) {
            char asciiCharacter = (char) decimalNumber;
            System.out.println("입력된 10진수에 해당되는 아스키 문자: " + asciiCharacter);
        } else {
            System.out.println("입력된 숫자가 0에서 255 범위를 벗어납니다.");
        }

    }
}
