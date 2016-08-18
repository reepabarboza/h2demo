package com.reepa.repository;

import com.reepa.domain.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by pradeep on 08-06-2016.
 */
@Repository
public interface PostRepository extends CrudRepository<Post, Long>{

    //author
    /*List<Post> findAllByAuthorFirstName(String firstName);
    List<Post> findAllByAuthorFirstNameIgnoreCase(String firstName);
    List<Post> findAllByAuthorFirstNameIgnoreCaseOrderByPostedOnDesc(String firstName);
    List<Post> findAllByAuthorFirstNameIgnoreCaseAndAuthorLastNameIgnoreCase(String firstName, String lastName);


    // KEYWORDS ====================================================================================================

    List<Post> findAllByKeywords(String keyword);

    List<Post> findAllByKeywordsLikeIgnoreCase(String keyword);

    // ACTIVE ======================================================================================================

    List<Post> findAllByActiveTrue();

    List<Post> findAllByActiveFalse();

    // AUTHOR & KEYWORDS ===========================================================================================

    List<Post> findAllByAuthorFirstNameAndKeywords(String first, String keywords);

    List<Post> findAllByAuthorFirstNameAndKeywordsOrderByPostedOnDesc(String first, String keywords);


    // QUERY =======================================================================================================

    @Query("select p from Post p where p.slug = ?1")
    Post findPostBySlug(String slug);

    @Query("select p from Post p where p.slug = :slug")
    Post findPostBySlugNamedParam( @Param("slug") String slug);

    @Query( value="SELECT * FROM Post where slug = :slug", nativeQuery = true )
    Post findPostBySlugNative( @Param("slug") String slug);

    //http://docs.spring.io/spring-data/jpa/docs/1.10.1.RELEASE/reference/html/#jpa.query-methods.query-creation -- refer this site for all query creation
    //5.3.2 query creation under query methods section



    //find the latest blog post to display
    //these are the queries, are part of spring JPA.. refer to documentation http://docs.spring.io/spring-data/jpa/docs/current/reference/html/
   *//* Post findFirstByOrderByPostedOnDesc();

    List<Post> findAllByOrderByPostedOnDesc();

    Post findBySlug(String slug);*/



    //CRUD operations

    Post findFirstByOrderByPostedOnDesc();

    List<Post> findAllByOrderByPostedOnDesc();

    Post findBySlug(String slug);

    List<Post> findAllByAuthorIdOrderByPostedOnDesc(Long id);
}
