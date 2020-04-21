package vn.com.nhomtruyen.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import vn.com.nhomtruyen.domain.UserTruyen;

/**
 * 
 * @author ToanNC7
 *
 */
@Repository
public interface UserTruyenRepository extends JpaRepository<UserTruyen, Long> {
	
	@Query(" SELECT u from UserTruyen u WHERE u.id = :id ")
	Optional<UserTruyen> findOneUserById(@Param("id") Long id);
	
	@Query(" SELECT u from UserTruyen u WHERE u.login = :login ")
	UserTruyen findOneUserByName(@Param("login") String login);
	
	@Query(" Select us FROM UserTruyen us WHERE us.userInfo.id = :id")
	Optional<UserTruyen> findByUserInfoByUserId(@Param("id") Long Id);
	
	@Query(" Select us FROM UserTruyen us WHERE us.login LIKE %:login% "
			+ " and us.userInfo.fullName LIKE %:fullName% ")
	Page<UserTruyen> findAllUser(Pageable pageable ,@Param("login") String userName, @Param("fullName") String fullName);
	
	@Query(value = "Select u.* " + 
			" FROM (((nt_user u INNER JOIN nt_group_user gu ON u.id = gu.user_id)" 
			+ " INNER JOIN nt_group_translate gr ON gr.id = gu.group_id ) " 
			+ " INNER JOIN nt_user_info uf ON u.id = uf.user_id ) " 
			+ " WHERE gr.id= :id "
			+ "	and u.login LIKE %:login% "
			+ "	and uf.full_name Like %:fullname% "
			+ " ORDER BY :sortBy",nativeQuery = true)
	Page<UserTruyen> getListUserByGroupId(Pageable pageable, @Param("id") Long id, @Param("login") String login, @Param("fullname") String fullName, @Param("sortBy") String sortBy);
	
	@Query(value = " SELECT us FROM User us WHERE us.login = :login")
    Optional<UserTruyen> findOneWithAuthoritiesByLogin(@Param("login") String login);

}
