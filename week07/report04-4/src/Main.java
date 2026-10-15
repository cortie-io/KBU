// Report 4 : 판매금액을 금액(공급가액)과 10% 부가가치세로 구분
// 판매금액 = 금액 + 금액 × 0.1 = 금액 × 1.1  =>  금액 = 판매금액 / 1.1, 세금 = 판매금액 - 금액
void main() {
    Scanner keyboard = new Scanner(System.in);
    int total;      // 판매금액
    int amount;     // 금액
    int tax;        // 세금(부가가치세)

    System.out.print("판매금액 : ");
    total = keyboard.nextInt();

    amount = (int) (total / 1.1);
    tax = total - amount;

    System.out.printf("판매금액 : %,d원\n", total);
    System.out.printf("금액     : %,d원\n", amount);
    System.out.printf("세금     : %,d원\n", tax);
}
