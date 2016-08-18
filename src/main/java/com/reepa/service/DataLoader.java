package com.reepa.service;

import com.reepa.domain.Author;
import com.reepa.domain.Post;
import com.reepa.repository.AuthorRepository;
import com.reepa.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by pradeep on 08-06-2016.
 */
@Service
public class DataLoader {


    private AuthorRepository authorRepository;
    private PostRepository postRepository;

    @Autowired
    public DataLoader(AuthorRepository authorRepository, PostRepository postRepository) {
        this.authorRepository = authorRepository;
        this.postRepository = postRepository;
    }

    /*@PostConstruct // After bean is created this method will be called
    private void loadData(){
        Author author = new Author("Reepa", "Barboza");
        authorRepository.save(author);

        Post post = new Post("Reepa rocks");
        post.setAuthor(author);
        post.setBody("Hello gal");
        post.setTitle("Reepa");
        postRepository.save(post);

    }*/
}
