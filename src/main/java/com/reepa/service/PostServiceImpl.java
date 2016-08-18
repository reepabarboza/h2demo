package com.reepa.service;

import com.reepa.domain.Post;
import com.reepa.repository.AuthorRepository;
import com.reepa.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PostServiceImpl /*implements PostService*/ {

    /*private PostRepository postRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository, AuthorRepository authorRepository){
        this.postRepository = postRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Post> list() {
        return postRepository.findAll();
    }

    @Override
    public Post read(long id) {
        return postRepository.findOne(id);
    }

    @Override
    @Transactional
    public Post create(Post post) {
        // save the new author
        authorRepository.save(post.getAuthor());
        return postRepository.save(post);
    }

    @Override
    public void delete(long id) {
        postRepository.delete(id);
    }

    @Override
    public Post update(long id,Post update) {
        Post post = postRepository.findOne(id);
        if( update.getTitle() != null ) {
            post.setTitle(update.getTitle());
        }
        return postRepository.save(post);
    }*/

}
