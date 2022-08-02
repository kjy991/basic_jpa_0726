package com.example.basic_jpa.jpaTest;

import javax.persistence.*;

@Entity
@MappedSuperclass
public class Delivery extends baseEntity{

    @Id
    @GeneratedValue
    private Long id;

    private Order order;

    private DeliveryStatus status;

}