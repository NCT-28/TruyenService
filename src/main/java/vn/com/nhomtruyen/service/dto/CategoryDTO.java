package vn.com.nhomtruyen.service.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import vn.com.nhomtruyen.domain.Category;
import vn.com.nhomtruyen.domain.Truyen;

/*
 * The class CategoryDTO express to entity Category
 * @author: ToanNC7
 * @since: 28/02/2020 
 * @version: 1.0
 */
public class CategoryDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private String description;

	private List<Truyen> truyens = new ArrayList<>();

	public CategoryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategoryDTO(Category category) {
		this.id=category.getId();
		this.name=category.getName();
		this.description=category.getDescription();
		this.truyens=category.getTruyens();
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
