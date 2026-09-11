void main(){
    Scanner scanner = new Scanner(System.in);

    // 반지름 입력 받기 (소수점 입력도 가능하도록 double형 사용)
    System.out.print("원의 반지름을 입력하세요: ");
    double radius = scanner.nextDouble();

    // 원의 넓이 계산 (넓이 = 반지름 × 반지름 × 원주율)
    double area = Math.PI * radius * radius;

    // 결과 출력
    System.out.println("\n--- 원의 정보 ---");
    System.out.println("반지름: " + radius);
    System.out.println("넓이: " + area);

    scanner.close();
}