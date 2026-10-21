import java.util.Scanner;

public class Report4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구매 금액 입력 : ");
        int price = sc.nextInt();
        System.out.print("멤버십 회원입니까? (true/false) : ");
        boolean member = sc.nextBoolean();

        if (price < 0) {
            System.out.println("오류: 구매 금액은 음수일 수 없습니다.");
        } else {
            boolean free = price >= 50000
                           || (member && price >= 30000);
            System.out.println(free ? "무료배송 적용"
                                    : "무료배송 미적용 (배송비 부과)");
        }
        sc.close();
    }
}
