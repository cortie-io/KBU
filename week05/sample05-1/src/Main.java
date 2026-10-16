import java.util.Scanner;

void main() {
    //다음과 같이 사각형의 가로 길이와 세로 길이를 입력 받아, 정사각형과 직사각형을 구분하고 넓이를 계산하는 Program을 작성하여라.
    int width, height;
    int area;
    char type;

    Scanner scanner = new Scanner(System.in);
    System.out.print("사각형의 가로 길이를 입력하세요(ex. 5): ");
    width = scanner.nextInt();
    System.out.print("사각형의 세로 길이를 입력하세요(ex. 10): ");
    height = scanner.nextInt();

    area = width * height;
    type = (width == height) ? '정' : '직';
    System.out.printf("\n\n***** %c사각형 넓이 *****\n", type);
    System.out.println("가로 길이 : " + width);
    System.out.println("세로 길이 : " + height);
    System.out.println(type + "사각형의 넓이: " + area);
}
