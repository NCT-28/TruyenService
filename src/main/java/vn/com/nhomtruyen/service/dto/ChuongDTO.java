package vn.com.nhomtruyen.service.dto;

import java.io.Serializable;

import vn.com.nhomtruyen.domain.Chuong;
import vn.com.nhomtruyen.domain.Truyen;

/*
 * The class ChuongDTO express to entity Chuong
 * @author: ToanNC7
 * @since: 28/02/2020 
 * @version: 1.0
 */
public class ChuongDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private Truyen truyen;

	private String name;

	private String content;
	
	public ChuongDTO() {
		super();
	}

	public ChuongDTO(Chuong chuong) {
		this.id=chuong.getId();
		this.truyen=chuong.getTruyen();
		this.name=chuong.getName();
		this.content=chuong.getContent();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Truyen getTruyen() {
		return truyen;
	}

	public void setTruyen(Truyen truyen) {
		this.truyen = truyen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
