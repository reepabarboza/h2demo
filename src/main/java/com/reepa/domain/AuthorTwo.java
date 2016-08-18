package com.reepa.domain;

/**
 * Created by pradeep on 07-06-2016.
 */
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AuthorTwo {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    //posts
    /*@OneToMany( mappedBy = "author" )
    private List<Post> posts;

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }*/

    @SuppressWarnings("unused")
    private AuthorTwo(){}

    public AuthorTwo(String first, String last){
        this.setFirstName(first);
        this.setLastName(last);
    }

    public AuthorTwo(String first, String last, String email){
        this.setFirstName(first);
        this.setLastName(last);
        this.setEmail(email);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author [firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}