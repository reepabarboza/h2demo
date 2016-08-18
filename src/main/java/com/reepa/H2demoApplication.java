package com.reepa;

import com.reepa.domain.Post;
import com.reepa.repository.PostRepository;
import com.reepa.service.DataLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class H2demoApplication {

	private static final Logger logger = LoggerFactory.getLogger(H2demoApplication.class);

	//PostREpository
	/*@Autowired
	PostRepository postRepository;*/

	/*@Autowired
	DataLoader dataLoader;*/

	public static void main(String[] args) {
		SpringApplication.run(H2demoApplication.class, args);
	}

	//POstConstruct
	/*@PostConstruct
	void seePosts(){
		logger.info("All posts");
		for(Post post : postRepository.findAll()) {
			logger.info("Posts displayed: "+ post.toString());
		}

	}*/
}
