void main() {
    // 출석(attend)과 과제 제출(report) 조건을 만족하면서
    // 부정행위(cheating) 기록이 없으면 온라인 시험에 응시할 수 있는지 검사

    Scanner keyboard = new Scanner(System.in);

    // 입력
    boolean attend = keyboard.nextBoolean();
    boolean report = keyboard.nextBoolean();
    boolean cheating = keyboard.nextBoolean();

    // 판별
    boolean canTakeExam = attend && report && !cheating;

    // 출력
    System.out.println(canTakeExam);

    keyboard.close();
}
