package com.reepa.service;

import com.reepa.domain.Author;
import com.reepa.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by reepa on 21-06-2016.
 */
@Service
public class AuthorService {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        super();
        this.authorRepository = authorRepository;
    }

    public List<Author> list() {
        return authorRepository.findAllByOrderByLastNameAscFirstNameAsc();
    }
}
