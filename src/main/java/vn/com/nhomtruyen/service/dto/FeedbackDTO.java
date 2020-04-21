package vn.com.nhomtruyen.service.dto;

import java.io.Serializable;
import java.time.Instant;

import vn.com.nhomtruyen.domain.Feedback;
import vn.com.nhomtruyen.domain.Truyen;

/*
 * The class FeedbackDTO express to entity Feedback
 * @author: ToanNC7
 * @since: 28/02/2020 
 * @version: 1.0
 */
public class FeedbackDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Truyen truyen;

	private String topic;

	private String nameUserSend;

	private String email;

	private String content;

	private boolean status;
	
	private String code;

	private  Instant dayView;
	
	

	public FeedbackDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public FeedbackDTO(Feedback feedback) {
		this.id=feedback.getId();
		this.truyen=feedback.getTruyen();
		this.topic=feedback.getTopic();
		this.nameUserSend=feedback.getNameUserSend();
		this.email=feedback.getEmail();
		this.content=feedback.getContent();
		this.status=feedback.isStatus();
		this.code=feedback.getCode();
		this.dayView=feedback.getDayView();
		
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

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getNameUserSend() {
		return nameUserSend;
	}

	public void setNameUserSend(String nameUserSend) {
		this.nameUserSend = nameUserSend;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Instant getDayView() {
		return dayView;
	}

	public void setDayView(Instant dayView) {
		this.dayView = dayView;
	}
	
}
