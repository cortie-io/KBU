void main() {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("나이를 입력하세요: ");
    int age = keyboard.nextInt();

    // 조건 연산자(? :)를 중첩하여 요금 계산
    int fare = (age < 7) ? 0
             : (age <= 18) ? 1000
             : (age <= 64) ? 1500
             : 0;

    System.out.println("시내버스 이용요금: " + fare + "원");
}
