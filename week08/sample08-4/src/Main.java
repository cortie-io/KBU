void main() {
    // 직원ID(id)가 등록되어 있으면서 비밀번호(password) 인증에 성공하고
    // 퇴사자(exemployee)가 아니어야 회사 보안 시스템 출입을 허가하는 JAVA 수식은?

    String id = "employee123";
    String password = "password123";
    boolean exemployee = false;

    boolean canAccess = id != null
            && password != null
            && !exemployee;

    System.out.println(canAccess);
}
