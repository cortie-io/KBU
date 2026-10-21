void main() {
    // 사람은 평균 분당 65회 심장이 박동한다
    // 사람의 평균 수명은 78년이다.
    // 그러면 사람은은 평생 몇 회의 심장 박동을 하는지 구해보자.

    Scanner scanner = new Scanner(System.in);

    final int heartbeatsPerMinute = 65;
    int lifeSpan;

    System.out.print("Enter your life span in years: ");
    lifeSpan = scanner.nextInt();

    long day = (heartbeatsPerMinute * 60) * 24;
    long year = day * 365;

    long totalHeartbeats = year * lifeSpan;
    System.out.println("Total heartbeats: " + totalHeartbeats);

}
