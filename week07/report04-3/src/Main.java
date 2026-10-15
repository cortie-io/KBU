// Report 3 : 지구에서의 몸무게를 달에서의 몸무게로 환산
// 달의 중력은 지구 중력의 약 16.5%
void main() {
    Scanner keyboard = new Scanner(System.in);
    final double MOON_GRAVITY = 0.165;
    double weight;  // 지구에서의 몸무게
    double moon;    // 달에서의 몸무게

    System.out.print("당신의 몸무게(kg)를 입력하세요 : ");
    weight = keyboard.nextDouble();

    moon = weight * MOON_GRAVITY;

    System.out.printf("지구에서의 몸무게 = %.1f kg\n", weight);
    System.out.printf("달에서의 몸무게   = %.2f kg\n", moon);
}
