package vn.com.nhomtruyen.service.mapper;

import org.mapstruct.Mapper;

import vn.com.nhomtruyen.domain.Truyen;
import vn.com.nhomtruyen.service.dto.TruyenDTO;

/*
 * The interface TruyenMapper mapper Truyen and TruyenDTO
 * 
 * @author: ToanNC
 * @since: 04/02/2020 
 * @version: 1.0
 */
@Mapper(componentModel = "spring", uses = {})
public interface TruyenMapper extends EntityMapper<Truyen, TruyenDTO> {
	default Truyen fromId(Long id) {
		if (id == null) {
			return null;
		}
		Truyen truyen = new Truyen();
		truyen.setId(id);
		return truyen;
	}
}
