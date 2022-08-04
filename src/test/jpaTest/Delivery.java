package com.example.basic_jpa.jpaTest;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@MappedSuperclass
@Getter
@Setter
public class Delivery extends baseEntity{

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    private DeliveryStatus status;

}