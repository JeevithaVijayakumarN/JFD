package com.nseit.post.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class DummyOrder {
    @Id
    @GeneratedValue
    private Integer ordId;

    @OneToMany(mappedBy = "dummyOrder",cascade = CascadeType.ALL)
    private Set<DummyCart> dummyCarts;
}
