package com.javaspring.batchprocessingdemo.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "CUSTOMER_INF0")
@IdClass(Customer.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {
    @Id
    @Column(name = "CUSTOMER_ID")
    private int id;
    @Id
    @Column(name = "FIRST_NAME")
    private String name;

}
