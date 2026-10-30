void main() {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("첫 번째 변 a : ");
    int a = keyboard.nextInt();
    System.out.print("두 번째 변 b : ");
    int b = keyboard.nextInt();
    System.out.print("세 번째 변 c : ");
    int c = keyboard.nextInt();

    // 성립 조건: 어떤 두 변의 합도 나머지 한 변보다 커야 함
    if (a > 0 && b > 0 && c > 0
            && a + b > c && a + c > b && b + c > a) {
        System.out.println("삼각형이 성립합니다.");

        String type;
        if (a == b && b == c) {
            type = "정 삼각형";
        } else if (a == b || b == c || a == c) {
            type = "이등변 삼각형";
        } else {
            type = "일반 삼각형";
        }
        // 직각 삼각형 판별 (피타고라스 정리)
        if (a * a + b * b == c * c || a * a + c * c == b * b
                || b * b + c * c == a * a) {
            type = type + " (직각 삼각형)";
        }
        System.out.println("삼각형의 종류 : " + type);

        // 헤론의 공식으로 면적 계산
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.printf("삼각형의 면적 : %.2f ㎠%n", area);
    } else {
        System.out.println("삼각형 아님");
    }
}
