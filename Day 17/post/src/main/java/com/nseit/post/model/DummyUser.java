package com.nseit.post.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter

public class DummyUser {
    @Id
    @GeneratedValue
    private Integer usId;
    private String name;

    @OneToMany(mappedBy = "dummyUser",cascade = CascadeType.ALL)
    private Set<DummyCart> dummyCarts;

}
