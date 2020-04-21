package vn.com.nhomtruyen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.com.nhomtruyen.domain.Author;

/*
 * The interface AuthorRepository extends JpaRepository user Annotation @Repository
 * 
 * @author: ToanNC
 * @since: 04/02/2020 
 * @version: 1.0
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{

}
