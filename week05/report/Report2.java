import java.util.Scanner;

public class Report2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 JAVA 점수 입력 : ");
        int score = sc.nextInt();

        // 100점은 99점과 같은 A+로 처리
        int s = (score == 100) ? 99 : score;

        // ASCII 코드 이용: 90점대 'A', 80점대 'B' ...
        char letter = (s < 60) ? 'F' : (char) ('A' + (9 - s / 10));

        // 일의 자리가 5 이상이면 +, 아니면 0
        String sign = (s < 60) ? "" : (s % 10 >= 5) ? "+" : "0";

        String grade = letter + sign;

        System.out.println();
        System.out.println("입력 점수 : " + score);
        System.out.println("학점 : " + grade);
        sc.close();
    }
}
