package vn.com.nhomtruyen.service.dto;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import vn.com.nhomtruyen.domain.Truyen;
import vn.com.nhomtruyen.domain.View;

/*
 * The class ViewDTO express to entity View
 * @author: ToanNC7
 * @since: 28/02/2020 
 * @version: 1.0
 */
public class ViewDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;

	private Truyen truyen;

	private Instant dayView = Instant.now();

	private int views;

	
	public ViewDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ViewDTO(View view) {
		this.id=view.getId();
		this.truyen=view.getTruyen();
		this.dayView=view.getDayView();
		this.views=view.getViews();
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
	
}
