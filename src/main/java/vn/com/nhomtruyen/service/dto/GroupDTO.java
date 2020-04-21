package vn.com.nhomtruyen.service.dto;

import java.io.Serializable;

import vn.com.nhomtruyen.domain.Group;

/**
 * EntityDTO Group.
 * 
 * @author ToanNC7
 *
 * @version 1.0 - 04/01/2020
 */
public class GroupDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private String description;

	public GroupDTO() {
	}
    
    public GroupDTO(Group group) {
    	this.id=group.getId();
    	this.name=group.getName();
    	this.description=group.getDescription();
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
}
