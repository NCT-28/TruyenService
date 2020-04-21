package vn.com.nhomtruyen.domain;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/*
 * The class View mapping nt_view
 * 
 * @author: ToanNC
 * @since: 04/02/2020 
 * @version: 1.0
 */
@Entity
@Table(name = "nt_view")
public class View implements Serializable{

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

	@Column(name = "day_view")
	private  Instant dayView = Instant.now();

	@Column(name = "view")
	private int views;

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

	public Instant getDayView() {
		return dayView;
	}

	public void setDayView(Instant dayView) {
		this.dayView = dayView;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	@Override
	public String toString() {
		return "Views [id=" + id + ", truyen=" + truyen + ", dayView=" + dayView + ", views=" + views + "]";
	}
	
	

}
