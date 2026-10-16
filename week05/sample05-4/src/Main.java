void main() {
    // 자판기에서 동전으로 거스름돈을 거슬러 줄 때 동전의 수량이 가정 적게 거슬러 주는 방법을 계산하여라.
    // 단, 자판기는 500원, 100원, 50원, 10원짜리 동전만 있다고 가정하자
    // 예) 1200원
    //    500원 : 2개
    //    100원 : 2개

    int[] coins = {500, 100, 50, 10};

    int change;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("거스름 돈을 입력하세요: ");
    change = keyboard.nextInt();

    for (int coin : coins) {
        int count = change / coin;
        change %= coin;
        System.out.println(coin + "원 : " + count + "개");
    }

}
