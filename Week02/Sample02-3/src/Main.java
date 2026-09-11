void main() {
    Scanner Keyboard = new Scanner(System.in);
    int radius;
    double area;
    System.out.print("원의 반지름 입력(정수형)? ");
    radius = Keyboard.nextInt();

    area = 3.141592 * radius * radius;

    System.out.printf("원의 반지름 : %d Cm, 면적 : %.2f \u33A0",radius,area);
}