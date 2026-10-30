void main() {
    // 상품 매입원가에 이익률 30%를 더하여 판매하고
    // 세율 10%를 적용한 납부세액을 계산하는 프로그램

    int purchasePrice = 1_015_000;  // 매입원가(원)
    double profitRate = 0.30;       // 이익률
    double taxRate = 0.10;          // 세율

    // 계산
    double sellingPrice = purchasePrice * (1 + profitRate);  // 판매 정가
    double salesTax = sellingPrice * taxRate;                 // 매출 세액
    double purchaseTax = purchasePrice * taxRate;             // 매입 세액
    double taxPayable = salesTax - purchaseTax;               // 납부 세액

    // 출력
    System.out.println("매입원가: " + purchasePrice + "원");
    System.out.println("판매 정가: " + sellingPrice + "원");
    System.out.println("매출 세액: " + salesTax + "원");
    System.out.println("매입 세액: " + purchaseTax + "원");
    System.out.println("납부 세액: " + taxPayable + "원");
}
