public class Report3 {
    public static void main(String[] args) {
        int total = 54321;

        int hour = total / 3600;       // 시간
        int rest = total % 3600;       // 시간을 빼고 남은 초
        int min = rest / 60;           // 분
        int sec = rest % 60;           // 초

        System.out.println(total + " 초 = " + hour + " 시간 "
                           + min + " 분 " + sec + " 초");
    }
}
