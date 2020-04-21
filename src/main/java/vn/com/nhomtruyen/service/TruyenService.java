package vn.com.nhomtruyen.service;

import vn.com.nhomtruyen.service.mess.TruyenMess;

/*
 * The interface TruyenService
 * 
 * @author: ToanNC
 * @since: 04/02/2020 
 * @version: 1.0
 */
public interface TruyenService {
	TruyenMess getAllTruyen(Integer pageNo, Integer pageSize, String name, String sortBy, String sortType);
}
