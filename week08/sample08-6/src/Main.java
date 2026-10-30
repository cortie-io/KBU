void main() {
    // 나이를 입력받아 나이에 따른 시내버스 이용요금을 계산하는 프로그램
    //   7세 미만(어린이)          : 무료
    //   7세 이상 18세 이하(청소년) : 1000원
    //   19세 이상 64세 이하(성인)  : 1500원
    //   65세 이상(노인)           : 무료

    Scanner keyboard = new Scanner(System.in);

    // 입력
    System.out.print("나이를 입력하세요: ");
    int age = keyboard.nextInt();

    // 요금 계산
    int fare;
    if (age < 7) {
        fare = 0;
    } else if (age <= 18) {
        fare = 1000;
    } else if (age <= 64) {
        fare = 1500;
    } else {
        fare = 0;
    }

    // 출력
    System.out.println("시내버스 이용요금: " + fare + "원");

    keyboard.close();
}
