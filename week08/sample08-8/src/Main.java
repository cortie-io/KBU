void main() {
    // 삼각형의 세 변을 입력받아 성립 여부, 종류 및 넓이를 계산하는 프로그램

    Scanner keyboard = new Scanner(System.in);

    // 입력
    System.out.print("a: ");
    int a = keyboard.nextInt();

    System.out.print("b: ");
    int b = keyboard.nextInt();

    System.out.print("c: ");
    int c = keyboard.nextInt();

    // 삼각형 성립 조건: 모든 변이 양수이고, 두 변의 합이 나머지 한 변보다 커야 함
    boolean isTriangle = a > 0 && b > 0 && c > 0
            && (long) a + b > c
            && (long) a + c > b
            && (long) b + c > a;

    if (isTriangle) {
        System.out.println("삼각형 성립");

        // 삼각형 종류 판별
        String type;
        if (a == b && b == c) {
            type = "정삼각형";
        } else if (a == b || b == c || a == c) {
            type = "이등변삼각형";
        } else {
            type = "일반삼각형";
        }
        System.out.println("삼각형 종류: " + type);

        // 직각삼각형 판별 (피타고라스 정리)
        long aa = (long) a * a;
        long bb = (long) b * b;
        long cc = (long) c * c;

        if (aa + bb == cc || aa + cc == bb || bb + cc == aa) {
            System.out.println("직각삼각형");
        }

        // 넓이 계산 (헤론의 공식)
        double s = ((double) a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("삼각형 넓이: " + area);
    } else {
        System.out.println("삼각형 아님");
    }

    keyboard.close();
}
