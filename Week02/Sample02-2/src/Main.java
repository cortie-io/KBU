void main() {
    // Scanner 객체 생성
    Scanner scanner = new Scanner(System.in);

    // 이름 입력 받기
    System.out.print("이름을 입력하세요: ");
    String name = scanner.nextLine();

    // 나이 입력 받기
    System.out.print("나이를 입력하세요: ");
    int age = scanner.nextInt();

    // 입력받은 값 출력하기
    System.out.println("\n--- 입력 결과 ---");
    System.out.println("이름: " + name);
    System.out.println("나이: " + age + "세");
    // Scanner 닫기 (메모리 누수 방지)
    scanner.close();

}