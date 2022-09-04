package com.nseit.post.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter

public class DummyCart {
    @Id
    @GeneratedValue
    private Integer cartId;
    private String name;

    @ManyToOne
    @JoinColumn(name = "User_Id",referencedColumnName = "usId")
    private DummyUser dummyUser;

@ManyToOne
@JoinColumn(name = "Order_Id",referencedColumnName = "ordId")
    private DummyOrder dummyOrder;

}
