void main() {
    // 당신의 체중을 입력 받아 금값으로 계산하면 나는 얼마 일까요? (1,000원 미만은 버림)

    Scanner keyboard = new Scanner(System.in);

    System.out.print("체중을 입력하세요: ");
    double weight = keyboard.nextDouble();

    double price = weight * 1000;

    System.out.println("금액: " + price);

}
