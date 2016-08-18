package com.reepa.controller;

import com.reepa.domain.Post;
import com.reepa.exception.PostNotFoundException;
import com.reepa.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by pradeep on 09-06-2016.
 */

//@RestController
@RequestMapping("/posts")
public class PostController {

    private PostService postService;



    //Rest API demo

    /*@Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }


    @RequestMapping( value = "/", method = RequestMethod.GET )
    public Iterable<Post> list(){
        return postService.list();
    }

    @RequestMapping( value = "/", method = RequestMethod.POST )
    public Post create(@RequestBody Post post){
        return postService.create(post);
    }

    @RequestMapping( value = "/{id}", method = RequestMethod.GET )
    public Post read(@PathVariable(value="id") long id) throws PostNotFoundException {

        Post result = postService.read(id);
        if(result == null) {
            throw new PostNotFoundException("Post with id " + id + " not found");
        }

        return result;
    }

    @RequestMapping( value = "/{id}", method = RequestMethod.PUT )
    public Post update(@PathVariable(value="id") long id, @RequestBody Post post){
        return postService.update(id,post);
    }

    @RequestMapping( value = "/{id}", method = RequestMethod.DELETE )
    public void delete(@PathVariable(value="id") int id){
        postService.delete(id);
    }


    @ExceptionHandler(PostNotFoundException.class)
    public void handlePostNotFound(PostNotFoundException exception, HttpServletResponse response) throws IOException{
        response.sendError( HttpStatus.NOT_FOUND.value(), exception.getMessage() );
    }*/


















    /*@Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping("/")
    public Iterable<Post> listPosts(Model model){
        System.out.println("entered post method");
        return postService.list();
    }

    @RequestMapping("/byAuthor/{firstName}")
    public List<Post> byAuthor(@PathVariable(value = "firstName") String firstName, Model model){
        return postService.byAuthor(firstName);
    }

    @RequestMapping("/byKeyword/{keyword}")
    public List<Post> byKeyword( @PathVariable(value="keyword") String keyword ) {
        return postService.byKeyword(keyword);
    }

    @RequestMapping("/active")
    public List<Post> active() {
        return postService.findActive();
    }

    @RequestMapping("/slug/{slug}")
    public Post findPostBySlug(@PathVariable(value="slug") String slug ) {
        return postService.findBySlug(slug);
    }*/








    /*@RequestMapping("/list")
    public String listPosts(Model model){
        model.addAttribute("posts", postService.list());
        return "post/list";
    }

    @RequestMapping("/view/{slug}")
    public String view(@PathVariable(value="slug") String slug, Model model){
        model.addAttribute("post", postService.getBySlug(slug));
        return "post/view";
    }*/
}
