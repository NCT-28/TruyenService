package vn.com.nhomtruyen.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/*
 * The class Truyen mapping nt_truyen
 * 
 * @author: ToanNC
 * @since: 04/02/2020 
 * @version: 1.0
 */
@Entity
@Table(name = "nt_truyen")
public class Truyen extends AbstractAuditingEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
	@SequenceGenerator(name = "sequenceGenerator")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "author_id", nullable = false)
	private Author author;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "so_chuong")
	private int soChuong;

	@Column(name = "nguon")
	private String nguon;

	@Column(name = "image_url")
	private String imageUrl;

	@Column(name = "fulls")
	private boolean full;

	@Column(name = "hot")
	private boolean hot;

	@Column(name = "new")
	private boolean news;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "truyen", cascade = CascadeType.ALL)
	private List<Chuong> chuongs = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "truyen", cascade = CascadeType.ALL)
	private List<View> views = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "truyen", cascade = CascadeType.ALL)
	private List<Feedback> feedbacks = new ArrayList<>();

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

	@Override
	public String toString() {
		return "Truyen [id=" + id + ", author=" + author + ", name=" + name + ", description=" + description
				+ ", soChuong=" + soChuong + ", nguon=" + nguon + ", imageUrl=" + imageUrl + ", full=" + full + ", hot="
				+ hot + ", news=" + news + ", chuongs=" + chuongs + ", views=" + views + ", feedbacks=" + feedbacks
				+ "]";
	}

}
