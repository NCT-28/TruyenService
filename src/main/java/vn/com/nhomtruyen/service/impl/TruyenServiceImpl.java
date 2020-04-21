package vn.com.nhomtruyen.service.impl;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.com.nhomtruyen.repository.TruyenRepository;
import vn.com.nhomtruyen.service.TruyenService;
import vn.com.nhomtruyen.service.mess.TruyenMess;

/*
 * The interface TruyenServiceImpl extends TruyenService user Annotation @Service and @Transactional
 * 
 * @author: ToanNC
 * @since: 04/02/2020 
 * @version: 1.0
 */

@Service
@Transactional
public class TruyenServiceImpl implements TruyenService {

	private final TruyenRepository truyenRepository;

	public TruyenServiceImpl(TruyenRepository truyenRepository) {
		super();
		this.truyenRepository = truyenRepository;
	}

	@Override
	public TruyenMess getAllTruyen(Integer pageNo, Integer pageSize, String name, String sortBy, String sortType) {
		Pageable pageable = null;

		if (sortType.equals("ASC")) {
			pageable = PageRequest.of(pageNo - 1, pageSize, Sort.by(Direction.ASC, sortBy));
		} else if (sortType.equals("DESC")) {
			pageable = PageRequest.of(pageNo - 1, pageSize, Sort.by(Direction.DESC, sortBy));
		}

		TruyenMess truyenMess = new TruyenMess();
		truyenMess.setMessage("Get list truyen success!");
		truyenMess.setTotalTruyens(truyenRepository.findAllTruyen(pageable, name).getTotalElements());
		truyenMess.setListTruyen(truyenRepository.findAllTruyen(pageable, name).getContent());

		return truyenMess;
	}

}
