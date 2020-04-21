package vn.com.nhomtruyen.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import com.fasterxml.jackson.annotation.JsonIgnore;

/*
 * The class Category mapping nt_category
 * 
 * @author: ToanNC
 * @since: 04/02/2020 
 * @version: 1.0
 */

@Entity
@Table(name = "nt_category")
public class Category extends AbstractAuditingEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "nt_category_truyen", joinColumns = {
			@JoinColumn(name = "category_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "truyen_id", referencedColumnName = "id") })
	@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
	@BatchSize(size = 20)
	private List<Truyen> truyens = new ArrayList<>();

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

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + ", truyens=" + truyens + "]";
	}

}
