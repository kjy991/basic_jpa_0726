//package com.example.basic_jpa.helloJpa;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import java.util.List;
//
//public class JpaMain {
//    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//
//        EntityManager em = emf.createEntityManager();
//
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//        try {
////            Member member = new Member();
////            member.setId(2L);
////            member.setName("helloA");
////            em.persist(member);
//
////            Member findMember = em.find(Member.class, 1L);
////            findMember.setName("HELLLLO");
////            em.remove(findMember);
////            findMember.setName("HelloJPA");
//
////            List<Member> result = em.createQuery("select m.id,m.name from Member as m", Member.class).getResultList();
////            for (Member member : result){
////                System.out.println("member.name = " + member.getName());
////            }
////            tx.commit();
//            // 비영속
////            Member member = new Member();
////            member.setId(121123L);
////            member.setName("h2212312412111");
//
//            // 영속
////            System.out.println("=====================before=====================");
////            em.persist(member);
////            System.out.println("=====================after=====================");
////            Member findMember1 = em.find(Member.class, 121L);
////            Member findMember2 = em.find(Member.class, 121L);
////            System.out.println(findMember1 == findMember2);
////            System.out.println("findMember.id  " + findMember1.getId());
////            System.out.println("findMember.name " + findMember1.getName());
////            Member member1 = new Member(152L,"hi1");
////            Member member2 = new Member(153L,"hi2");
////            em.persist(member1);
////            em.persist(member2);
////            System.out.println("===========================");
//
////            Member member = em.find(Member.class, 150L);
////            member.setName("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
////            }
//            Member member = new Member();
//            member.setUsername("a1");
//            em.persist(member);
//
//            System.out.println("==========================================================");
//            tx.commit();
//
//        } catch (Exception e) {
//            tx.rollback();
//        } finally {
//            em.close();
//        }
//        emf.close();
//    }
//}
