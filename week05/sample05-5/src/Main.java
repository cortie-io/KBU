void main() {
    // 놀이공원 매표소에서 방문객의 나이(int)를 입력 받아 다음의 요구 조건을 충족하는 입장료를 계산하는 Program을 작성해보자.
    // 요구사항
    // 7세 이하와 65세 이상은 무료(0원)
    // 그 외에는 5,000원
    // if() 문 없이 삼항 연산자(? :)와 논리 연산자만 사용
    // age의 범위는 0 이상 120 이하

    int age;
    final int ENTER_PRICE = 5000;
    int price = 0;


    Scanner keyboard = new Scanner(System.in);

    System.out.print("나이를 입력하세요: ");
    age = keyboard.nextInt();

    boolean isFree = age <= 7 || age >= 65;
    price = isFree ? 0 : ENTER_PRICE;
    System.out.println("입장료: " + price + "원");
}
