package com.nseit.post.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "users")
public class UserPost {
    @Id
    @GeneratedValue
    private Integer UserId;
    private String Name;

    @OneToMany(mappedBy = "userPost", cascade = CascadeType.ALL)
    private Set<Post> post;
}
