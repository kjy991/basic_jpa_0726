package com.example.basic_jpa.jpaTest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.ArrayList;
import java.util.List;

@Entity
@MappedSuperclass
public class Member extends baseEntity{

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private List<Order> orders = new ArrayList<>();


}
