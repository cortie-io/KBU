void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("출석률(%): ");
    int attend = keyboard.nextInt();
    System.out.print("과제 제출률(%): ");
    int report = keyboard.nextInt();
    System.out.print("부정행위 기록(true/false): ");
    boolean cheating = keyboard.nextBoolean();

    boolean canTakeExam = attend >= 80 && report >= 70 && !cheating;
    System.out.println("시험 응시 가능: " + canTakeExam);
}
