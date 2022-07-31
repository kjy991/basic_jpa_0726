package com.example.basic_jpa.jpashop;

import lombok.Cleanup;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class OrderItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @Column(name = "ORDER_ID")
    private Long orderId;

//    @ManyToOne
//    @JoinColumn(name = "member_member_id")
    @OneToOne
    @JoinColumn(name = "member_member_id")
    private Member member;

    @Column(name = "ITEM_ID")
    private Long itemId;

    private int orderPrice;
    private int count;
}
