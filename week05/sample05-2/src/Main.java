void main() {
    // 상품 가격과 회원 등급을 입력 받아 최종 결제 금액을 출력 하는 Program을 작성하여라.
    //
    // 회원 등급
    // "VIP", "GOLD", "SILVER", "NONE“
    //
    // 할인율
    // VIP : 20% 할인
    // GOLD : 15% 할인
    // SILVER: 10% 할인
    // NONE : 할인 없음
    // 결제 금액이 100,000원 이상이면 추가로 5% 할인

    int price;
    String grade;
    boolean isDiscount = false;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("상품 가격을 입력하세요: ");
    price = keyboard.nextInt();
    System.out.print("회원 등급을 입력하세요(VIP, GOLD, SILVER, NONE): ");
    grade = keyboard.next();

    switch (grade) {
        case "VIP":
            price *= 0.8;
            break;
        case "GOLD":
            price *= 0.85;
            break;
        case "SILVER":
            price *= 0.9;
            break;
        case "NONE":
            price *= 1.0;
            break;
    }

    if (price >= 100000) {
        price *= 0.95;
        isDiscount = true;
    }

    System.out.println("최종 결제 금액: " + price);
    System.out.println("\n*추가할인 여부 : " + (isDiscount? "Y" : "N"));

}
