package vn.com.nhomtruyen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.com.nhomtruyen.domain.Feedback;

/*
 * The interface FeedbackRepository extends JpaRepository user Annotation @Repository
 * 
 * @author: ToanNC
 * @since: 04/02/2020 
 * @version: 1.0
 */
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

}
