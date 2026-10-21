void main() {
    // 지구(Earth)의 표면적에서 대한민국이 얼마를 차지하고 있는가 ?
    // 지구의 반지름 : 6,378,137m
    // 대한민국 넓이 : 99,720㎢

    final int radius = 6378;
    final double PI = Math.PI;

    double earthArea = 4 * PI * radius * radius;

    final double koreaArea = 100505;
    double koreaRatio = (koreaArea / earthArea) * 100;

    System.out.println("대한민국이 지구의 " + koreaRatio + "를 차지하고 있습니다.");


}
