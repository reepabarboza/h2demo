package com.reepa.service;

import com.reepa.domain.Post;
import com.reepa.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pradeep on 09-06-2016.
 */
@Service
public class PostService {
//public interface PostService {


    //REst APIs demo
   /* Iterable<Post> list();
    Post create(Post post);
    Post read(long id);
    Post update(long id, Post post);
    void delete(long id);*/




    /*private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Iterable<Post> list(){
        return postRepository.findAll();
    }


    public List<Post> byAuthor(String firstName) {
        return postRepository.findAllByAuthorFirstNameIgnoreCaseOrderByPostedOnDesc(firstName);
    }

    public List<Post> byKeyword(String keyword) {
        return postRepository.findAllByKeywordsLikeIgnoreCase('%' + keyword + '%');
    }

    public List<Post> findActive() {
        return postRepository.findAllByActiveTrue();
    }

    public Post findBySlug(String slug) {
        return postRepository.findPostBySlugNative(slug);
    }*/


    /*public Post getLatestPost(){
        return postRepository.findFirstByOrderByPostedOnDesc();
    }

    public List<Post> list(){
        return postRepository.findAllByOrderByPostedOnDesc();
    }

    public Post getBySlug(String slug){
        return postRepository.findBySlug(slug);
    }*/






    //CRUD operations

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository){
        this.postRepository = postRepository;
    }

    public Post getLatestPost(){
        return postRepository.findFirstByOrderByPostedOnDesc();
    }

    public List<Post> list() {
        return postRepository.findAllByOrderByPostedOnDesc();
    }

    public Post getBySlug(String slug) {
        return postRepository.findBySlug(slug);
    }

    public List<Post> listByAuthor(Long id) {
        return postRepository.findAllByAuthorIdOrderByPostedOnDesc(id);
    }

    public Post get(Long id) {
        return postRepository.findOne(id);
    }

    public Post save(Post post) {
        return postRepository.save(post);
    }

    public void delete(Long id) {
        postRepository.delete(id);
    }
}
