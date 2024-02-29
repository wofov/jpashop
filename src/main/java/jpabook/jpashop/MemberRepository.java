package jpabook.jpashop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {
    @PersistenceContext
    private EntityManager em;

    //커맨드 + 쉬프트 + T // 테스트 자동 작성

    public long save(Member member){
        em.persist(member);
        return member.getId();
    }
    public Member find(long id){
        return em.find(Member.class, id);
    }
}
