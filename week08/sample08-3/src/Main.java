void main() {
    // 나이(age)가 21세 이상이면서 운전면허(license) 취득 후 1년 이상 경과하고
    // 음주운전(drunk) 전력이 없어야 차량 렌트 가능한 JAVA 수식은?

    int age = 25;
    int license = 2;        // 운전면허 취득 후 경과 연수
    boolean drunk = false;

    boolean canRentCar = age >= 21
            && license >= 1
            && !drunk;

    System.out.println(canRentCar);
}
