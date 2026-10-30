void main() {
    boolean id = true;          // 직원 ID 등록 여부
    boolean password = true;    // 비밀번호 인증 성공 여부
    boolean exemployee = false; // 퇴사자 여부

    boolean canAccess = id && password && !exemployee;
    System.out.println(canAccess);
}
