package com.example.basic_jpa.jpashop;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;


    @Column(name = "USERNAME")
    private String name;

    private String city;
    private String street;
    private String zipcode;

    @OneToMany(mappedBy = "member") // 양방향 관계 !
    private List<Order> orders = new ArrayList<>();



//    @ManyToOne // 연관 관계의 주인
//    @JoinColumn(name = "TEAM_ID")
//    private Team team;
//    public void changeTeam(Team team) {
//        this.team = team;
//        team.getMembers().add(this);
//    }
}
