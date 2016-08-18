package com.reepa.controller;

import com.reepa.domain.Weather;
import com.reepa.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by pradeep on 09-06-2016.
 */


//@RestController
public class HomeController {

    /*PostService postService;

    @Autowired
    public HomeController(PostService postService) {
        this.postService = postService;
    }
*/
    /*@RequestMapping("/")
    public String home(Model model){
        //model.addAttribute("post", postService.getLatestPost());
        return "index";
    }*/

    @RequestMapping("/")
    public Weather home(Model model){
        RestTemplate template = new RestTemplate();
        Weather weather = template.getForObject("http://localhost:8080/data/weather.json", Weather.class);
        return weather;
    }

    /*@RequestMapping("/")
    public String home(Model model){

        return "weather";
    }*/
}
