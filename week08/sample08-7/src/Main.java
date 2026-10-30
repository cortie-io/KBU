void main() {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("지출액을 입력하세요: ");
    int expenditure = keyboard.nextInt();
    System.out.print("저축액을 입력하세요: ");
    int savings = keyboard.nextInt();

    if (expenditure <= 0 || savings < 0 || savings > expenditure) {
        System.out.println("잘못된 입력입니다.");
        return;
    }

    int foodExpense = expenditure - savings;

    double engelIndex = (double) foodExpense / expenditure * 100;
    String level = "";
    if (engelIndex <= 30) {
        level = "상류층";
    } else if (engelIndex <= 50) {
        level = "중산층";
    } else {
        level = "하류층";
    }

    System.out.println("식생활비: " + foodExpense + "원");
    System.out.println("엥겔 지수: " + engelIndex + "%");
    System.out.println("생활 수준: " + level);
}
