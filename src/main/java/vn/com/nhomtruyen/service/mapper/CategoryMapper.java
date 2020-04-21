package vn.com.nhomtruyen.service.mapper;

import org.mapstruct.Mapper;

import vn.com.nhomtruyen.domain.Category;
import vn.com.nhomtruyen.service.dto.CategoryDTO;

/*
 * The interface CategoryMapper mapper Category and CategoryDTO
 * 
 * @author: ToanNC
 * @since: 04/02/2020 
 * @version: 1.0
 */
@Mapper(componentModel = "spring", uses = {})
public interface CategoryMapper extends EntityMapper<Category, CategoryDTO> {
	default Category fromId(Long id) {
		if (id == null) {
			return null;
		}
		Category category = new Category();
		category.setId(id);
		return category;
	}

}
