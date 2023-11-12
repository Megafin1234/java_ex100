import java.util.Scanner;
public class ex100_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("영문자 한 개를 입력하세요:");
        String input = scanner.nextLine();
        char character = input.charAt(0);
        int asciiCode = (int) character;


        System.out.println("입력 받은 문자에 해당되는 아스키 코드값: " + asciiCode);
    }
}
