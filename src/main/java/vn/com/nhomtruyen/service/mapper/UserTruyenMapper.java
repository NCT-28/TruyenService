package vn.com.nhomtruyen.service.mapper;

import org.mapstruct.Mapper;

import vn.com.nhomtruyen.domain.UserTruyen;
import vn.com.nhomtruyen.service.dto.UserTruyenDTO;
/**
 * 
 * @author ToanNC7
 *
 */
@Mapper(componentModel = "spring", uses = {})
public interface UserTruyenMapper extends EntityMapper<UserTruyenDTO, UserTruyen> {

	default UserTruyen fromId(Long id) {
		if (id == null) {
			return null;
		}
		UserTruyen user = new UserTruyen();
		user.setId(id);
		return user;
	}
}
