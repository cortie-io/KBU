void main() {
    // 지출액과 저축액을 입력받아 엥겔 지수를 계산하고 생활 수준을 판별하는 프로그램
    //   30% 이하 : 상류층
    //   50% 이하 : 중산층
    //   그 외    : 하류층

    Scanner keyboard = new Scanner(System.in);

    // 입력
    System.out.print("지출액을 입력하세요: ");
    int expenditure = keyboard.nextInt();

    System.out.print("저축액을 입력하세요: ");
    int savings = keyboard.nextInt();

    // 계산
    int foodExpense = expenditure - savings;
    double engelIndex = (double) foodExpense / expenditure * 100;

    // 생활 수준 판별
    String level;
    if (engelIndex <= 30) {
        level = "상류층";
    } else if (engelIndex <= 50) {
        level = "중산층";
    } else {
        level = "하류층";
    }

    // 출력
    System.out.println("식생활비: " + foodExpense + "원");
    System.out.println("엥겔 지수: " + engelIndex + "%");
    System.out.println("생활 수준: " + level);

    keyboard.close();
}
