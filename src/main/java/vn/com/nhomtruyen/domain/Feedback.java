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
 * The class Feedback mapping nt_feedback
 * 
 * @author: ToanNC
 * @since: 04/02/2020 
 * @version: 1.0
 */

@Entity
@Table(name = "nt_feedback")
public class Feedback implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "truyen_id", nullable = false)
	private Truyen truyen;

	@Column(name = "topic")
	private String topic;
	
	@Column(name = "name_user_send")
	private String nameUserSend;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "status")
	private boolean status;
	
	@Column(name = "code")
	private String code;
	
	
	@Column(name = "created_view")
	private  Instant dayView = Instant.now();


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


	@Override
	public String toString() {
		return "Feedback [id=" + id + ", truyen=" + truyen + ", topic=" + topic + ", nameUserSend=" + nameUserSend
				+ ", email=" + email + ", content=" + content + ", status=" + status + ", code=" + code + ", dayView="
				+ dayView + "]";
	}
	

}
