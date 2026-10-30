void main() {
    int purchase = 2500000;     // 총 구매 금액(원)
    int count = 25;             // 구매 횟수
    int member = 6;             // 가입 기간(년)
    boolean blacklist = false;  // 블랙리스트 여부

    // 블랙리스트 제외는 전체 조건에 적용 → 괄호 필수
    boolean isVip = (purchase >= 2000000 && count >= 20 || member >= 5)
                    && !blacklist;
    System.out.println(isVip);
}
