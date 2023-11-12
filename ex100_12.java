import java.util.Scanner;

public class ex100_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("단어를 입력하세요:");
        String word = scanner.nextLine();
        System.out.println("입력받은 단어를 그대로 출력: " + word);
    }
}