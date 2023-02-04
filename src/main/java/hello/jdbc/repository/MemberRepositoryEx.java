package hello.jdbc.repository;

import hello.jdbc.domain.Member;

import java.sql.SQLException;

public interface MemberRepositoryEx {
    /**
     * SQLException 에 의존하고 있으므로 순수한(좋은) 인터페이스가 아니다.
     */
    Member save(Member member) throws SQLException;
    Member findById(String memberId) throws SQLException;
    void update(String memberId, int money) throws SQLException;
    void delete(String memberId) throws SQLException;
}
