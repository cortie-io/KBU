void main() {
    // 사과의 개당 가격은 500원, 배의 개당 가격은 600원이다.구입하고자 하는 사과와 배의 개수와 지불한 금액을 입력 받아 거스름 돈을 계산하는 Program을 만들어 보자

    final int ApplePrice = 500;
    final int PearPrice = 600;

    int appleCount, pearCount;

    int paidAmount;
    int totalPrice;
    int change;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("사과의 개수를 입력하세요: ");
    appleCount = keyboard.nextInt();
    System.out.print("배의 개수를 입력하세요: ");
    pearCount = keyboard.nextInt();
    System.out.print("지불한 금액을 입력하세요: ");
    paidAmount = keyboard.nextInt();

    totalPrice = (ApplePrice * appleCount) + (PearPrice * pearCount);
    change = paidAmount - totalPrice;

    if (change < 0) {
        System.out.printf("지불한 금액이 %d원 부족합니다.\n", -change);
        return;
    }
    System.out.println("거스름 돈: " + change);


}
