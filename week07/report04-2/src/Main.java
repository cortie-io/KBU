// Report 2 : 직육면체의 부피 계산 (부피 = 가로 × 세로 × 높이)
void main() {
    Scanner keyboard = new Scanner(System.in);
    int width;      // 가로
    int length;     // 세로
    int height;     // 높이
    int vol;        // 부피

    System.out.print("직육면체 가로 세로 높이 입력 : ");
    width = keyboard.nextInt();
    length = keyboard.nextInt();
    height = keyboard.nextInt();

    vol = width * length * height;

    System.out.printf("직육면체 가로 = %d Cm\n", width);
    System.out.printf("직육면체 세로 = %d Cm\n", length);
    System.out.printf("직육면체 높이 = %d Cm\n", height);
    System.out.printf("직육면체 부피 = %d Cm³\n", vol);
}
