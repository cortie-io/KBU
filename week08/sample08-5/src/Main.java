void main() {
    // 우리 회사의 VIP 고객은 총 구매(purchase) 금액이 200만원 이상이고
    // 구매 횟수(count)가 20회 이상이거나 가입 기간(member)이 5년 이상이지만,
    // 단 블랙리스트(blacklist) 고객은 제외하는 JAVA 수식은?

    int purchase = 2_500_000;   // 총 구매 금액(원)
    int count = 25;             // 구매 횟수
    int member = 6;             // 가입 기간(년)
    boolean blacklist = false;

    boolean isVip = (purchase >= 2_000_000 && count >= 20 || member >= 5)
            && !blacklist;

    System.out.println(isVip);
}
