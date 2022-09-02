package com.nseit.post.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue
    private Integer catId;
    private String Name;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private Set<Post> post;
}
