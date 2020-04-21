package vn.com.nhomtruyen.service.mapper;

import java.util.List;

/*
 * The interface EntityMapper
 * @author: ToanNC7
 * @since: 28/02/2020 
 * @version: 1.0
 */
public interface EntityMapper<D, E> {
	E toEntity(D dto);

	D toDto(E entity);

	List<E> toEntity(List<D> dtoList);

	List<D> toDto(List<E> entityList);
}
