void main() {
    Scanner scanner = new Scanner(System.in);

    final int life = 7;
    int year;
    int ciga;

    System.out.println("당신은 몇년간 담배를 피웠나요? : ");
    year = scanner.nextInt();
    System.out.println("하루에 몇 개피를 피우시냐요? : ");
    ciga = scanner.nextInt();

    int day = year * 365;
    int count = day * ciga;
    int decrease_time = count * life;
    int hour = decrease_time / 60;
    int minute = decrease_time % 60;
    int decrease_day = decrease_time / 60 / 24;
    hour = hour % 24;

    System.out.println("담배를 피운지 " + decrease_day + "일 " + hour + "시간 " + minute + "분");

}
