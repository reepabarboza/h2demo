package com.reepa.repository;

import com.reepa.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by pradeep on 08-06-2016.
 */
@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {


    List<Author> findAllByOrderByLastNameAscFirstNameAsc();
}
