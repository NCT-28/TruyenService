package vn.com.nhomtruyen.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import vn.com.nhomtruyen.domain.Truyen;

/*
 * The interface TruyenRepository extends JpaRepository user Annotation @Repository
 * 
 * @author: ToanNC
 * @since: 04/02/2020 
 * @version: 1.0
 */
@Repository
public interface TruyenRepository extends JpaRepository<Truyen, Long> {

	@Query(" SELECT tr FROM Truyen tr WHERE tr.name LIKE %:name% ")
	Page<Truyen> findAllTruyen(Pageable pageable, @Param("name") String name);

}
