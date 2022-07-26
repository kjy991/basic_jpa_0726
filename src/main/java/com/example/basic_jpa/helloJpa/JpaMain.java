package com.example.basic_jpa.helloJpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
//            Member member = new Member();
//            member.setId(2L);
//            member.setName("helloA");
//            em.persist(member);

//            Member findMember = em.find(Member.class, 1L);
//            findMember.setName("HELLLLO");
//            em.remove(findMember);
//            findMember.setName("HelloJPA");

            List<Member> result = em.createQuery("select m.id,m.name from Member as m", Member.class).getResultList();
            for (Member member : result){
                System.out.println("member.name = " + member.getName());
            }
            tx.commit();

        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
