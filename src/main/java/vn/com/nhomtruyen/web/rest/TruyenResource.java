package vn.com.nhomtruyen.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vn.com.nhomtruyen.service.TruyenService;
import vn.com.nhomtruyen.service.mess.TruyenMess;

/**
 * RestController Truyen.
 * @author ToanNC7
 * @version 1.0 - 04/01/2020
 */
@RestController
@RequestMapping(value = "/api/")
public class TruyenResource {
	@Value("${jhipster.clientApp.name}")
	private String applicationName;
	
	private final Logger log = LoggerFactory.getLogger(TruyenResource.class);
	private static final String ENTITY_NAME = "usersUser";
	
	private final TruyenService truyenService;
	
	
	public TruyenResource(TruyenService truyenService) {
		super();
		this.truyenService = truyenService;
	}


	/**
	 * 
	 * @param pageNo   What is the slide? 0, 1, 2, 3 ...
	 * @param pageSize Number of elements per page default value 10,
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list
	 *         of users in body.
	 */
	@GetMapping(value = "/truyens")
	public ResponseEntity<TruyenMess> getAllTruyen(
			@RequestParam(defaultValue = "1") Integer pageNo,
			@RequestParam(defaultValue = "10") Integer pageSize,
			@RequestParam(defaultValue = "") String name,
			@RequestParam(defaultValue = "ASC") String sortType,
			@RequestParam(defaultValue = "name") String sortBy) {
		
		log.debug("REST request to get list users : {}");
		
		TruyenMess truyenMess = truyenService.getAllTruyen(pageNo, pageSize, name, sortBy, sortType);
		
		return new ResponseEntity<>(truyenMess, new HttpHeaders(), HttpStatus.OK);
	}
}
