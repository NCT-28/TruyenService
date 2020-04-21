package vn.com.nhomtruyen.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
 * The class Chuong mapping nt_chuong
 * 
 * @author: ToanNC
 * @since: 04/02/2020 
 * @version: 1.0
 */


@Entity
@Table(name = "nt_chuong")
public class Chuong extends AbstractAuditingEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "truyen_id", nullable = false)
	private Truyen truyen;

	@Column(name = "name")
	private String name;

	@Column(name = "content")
	private String content;

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

	@Override
	public String toString() {
		return "Chuong [id=" + id + ", truyen=" + truyen + ", name=" + name + ", content=" + content + "]";
	}
	
}
