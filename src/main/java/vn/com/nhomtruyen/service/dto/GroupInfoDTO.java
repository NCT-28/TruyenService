package vn.com.nhomtruyen.service.dto;

import java.io.Serializable;
import java.util.List;

import vn.com.nhomtruyen.domain.Group;
import vn.com.nhomtruyen.domain.Role;
import vn.com.nhomtruyen.domain.UserTruyen;

/**
 * 
 * @author ToanNC7
 *
 */
public class GroupInfoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;

	private String name;

	private String description;
	
	private List<UserTruyen> users;
	private List<Role> roles;

	public GroupInfoDTO() {
	}
    
    public GroupInfoDTO(Group group) {
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
	
	
	public List<UserTruyen> getUsers() {
		return users;
	}

	public void setUsers(List<UserTruyen> users) {
		this.users = users;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

    
}
