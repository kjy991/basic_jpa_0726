package com.example.basic_jpa;

import com.example.basic_jpa.jpashop.Member;
import com.example.basic_jpa.jpashop.Team;

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
            Team team = new Team();
            team.setName("TeamA");
//            team.getMembers().add(member);
            em.persist(team);

            Member member = new Member();
            member.setName("member2");
//            member.changeTeam(team); //**
            em.persist(member);

            team.addMember(member);

            em.flush();
            em.clear();

            Team findTeam = em.find(Team.class, team.getId()); // 1차 캐시에 저장 되어 있음
            List<Member> members = findTeam.getMembers();
            System.out.println("=============================");
            for (Member m : members) {
                System.out.println("m = " + m.getName());
            }
            System.out.println("=============================");


            tx.commit();


        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
