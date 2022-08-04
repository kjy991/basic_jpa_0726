//package com.example.basic_jpa.jpashop;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "owner")
//public class Owner {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "OWNER_ID")
//    private Long id;
//
////    @Column(name = "TEAM_ID")
////    private Long teamId;
//
//    @ManyToOne
//    @JoinColumn(name = "TEAM_ID")
//    private Team team;
//
//    @Column(name = "USERNAME")
//    private String name;
//}