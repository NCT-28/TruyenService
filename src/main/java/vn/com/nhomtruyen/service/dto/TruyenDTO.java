package vn.com.nhomtruyen.service.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import vn.com.nhomtruyen.domain.Author;
import vn.com.nhomtruyen.domain.Chuong;
import vn.com.nhomtruyen.domain.Feedback;
import vn.com.nhomtruyen.domain.Truyen;
import vn.com.nhomtruyen.domain.View;

/*
 * The class TruyenDTO express to entity Truyen
 * @author: ToanNC7
 * @since: 28/02/2020 
 * @version: 1.0
 */
public class TruyenDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;

	private Author author;

	private String name;

	private String description;

	private int soChuong;

	private String nguon;

	private String imageUrl;

	private boolean full;

	private boolean hot;

	private boolean news;

	private List<Chuong> chuongs = new ArrayList<>();

	private List<View> views = new ArrayList<>();

	private List<Feedback> feedbacks = new ArrayList<>();

	public TruyenDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TruyenDTO(Truyen truyen) {
		this.id=truyen.getId();
		this.author=truyen.getAuthor();
		this.name=truyen.getName();
		this.description=truyen.getDescription();
		this.soChuong=truyen.getSoChuong();
		this.nguon=truyen.getNguon();
		this.imageUrl=truyen.getImageUrl();
		this.full=truyen.isFull();
		this.hot=truyen.isHot();
		this.news=truyen.isNews();
		this.chuongs=truyen.getChuongs();
		this.views=truyen.getViews();
		this.feedbacks=truyen.getFeedbacks();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
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
	public int getSoChuong() {
		return soChuong;
	}
	public void setSoChuong(int soChuong) {
		this.soChuong = soChuong;
	}
	public String getNguon() {
		return nguon;
	}
	public void setNguon(String nguon) {
		this.nguon = nguon;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public boolean isFull() {
		return full;
	}
	public void setFull(boolean full) {
		this.full = full;
	}
	public boolean isHot() {
		return hot;
	}
	public void setHot(boolean hot) {
		this.hot = hot;
	}
	public boolean isNews() {
		return news;
	}
	public void setNews(boolean news) {
		this.news = news;
	}
	public List<Chuong> getChuongs() {
		return chuongs;
	}
	public void setChuongs(List<Chuong> chuongs) {
		this.chuongs = chuongs;
	}
	public List<View> getViews() {
		return views;
	}
	public void setViews(List<View> views) {
		this.views = views;
	}
	public List<Feedback> getFeedbacks() {
		return feedbacks;
	}
	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}
	
}
