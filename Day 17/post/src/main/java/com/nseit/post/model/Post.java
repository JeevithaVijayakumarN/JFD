package com.nseit.post.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue
    private Integer postId;
    private String Name;
    @ManyToOne
            @JoinColumn(name="user_id",referencedColumnName = "userId")
    private UserPost userPost;
    @ManyToOne
    @JoinColumn(name="cat_id",referencedColumnName = "catId")
    private Category category;
}
