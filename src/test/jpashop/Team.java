//package com.example.basic_jpa.jpashop;
//
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Getter
//@Setter
//public class Team {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
////    @Column(name = "TEAM_ID")
//    private Long id;
//
//    private String name;
//
//    @OneToMany(mappedBy = "team")
//    private List<Member> members = new ArrayList<>();
//
//    @OneToMany(mappedBy = "team")
//    private List<Bib> bibs = new ArrayList<>();
//
//    @OneToMany(mappedBy = "team")
//    private List<Owner> owners = new ArrayList<>();
//
//
//    public void addMember(Member member) {
//        member.setTeam(this);
//        members.add(member);
//    }
//}
