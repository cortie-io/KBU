void main() {
    // 매입원가에 이익률 30%를 더해 판매하고
    // 세율 10%를 적용한 납부 세액 계산
    int purchasePrice = 1015000;
    double profitRate = 0.30;
    double taxRate = 0.10;

    double sellingPrice = purchasePrice * (1 + profitRate); // 정가
    double salesTax = sellingPrice * taxRate;       // 매출 세액
    double purchaseTax = purchasePrice * taxRate;   // 매입 세액
    double taxPayable = salesTax - purchaseTax;     // 납부 세액

    System.out.println("매입원가: " + purchasePrice + "원");
    System.out.println("판매 정가: " + sellingPrice + "원");
    System.out.println("매출 세액: " + salesTax + "원");
    System.out.println("매입 세액: " + purchaseTax + "원");
    System.out.println("납부 세액: " + taxPayable + "원");
}
