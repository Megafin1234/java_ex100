import java.util.Scanner;

public class ex100_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 문자를 입력하세요:");
        char firstChar = scanner.next().charAt(0);

        System.out.println("두 번째 문자를 입력하세요:");
        char secondChar = scanner.next().charAt(0);

        System.out.println(secondChar + " " + firstChar);
    }
}