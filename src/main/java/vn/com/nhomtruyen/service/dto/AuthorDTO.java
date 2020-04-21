package vn.com.nhomtruyen.service.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import vn.com.nhomtruyen.domain.Author;
import vn.com.nhomtruyen.domain.Truyen;

/*
 * The class AuthorDTO express to entity Author
 * @author: ToanNC7
 * @since: 28/02/2020 
 * @version: 1.0
 */
public class AuthorDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;

	private String name;
	
	private String description;
	
	private List<Truyen> truyens = new ArrayList<>();

	public AuthorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuthorDTO(Author author) {
		this.id=author.getId();
		this.name=author.getName();
		this.description=author.getDescription();
		this.truyens=author.getTruyens();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Truyen> getTruyens() {
		return truyens;
	}

	public void setTruyens(List<Truyen> truyens) {
		this.truyens = truyens;
	}
		
}
