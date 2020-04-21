package vn.com.nhomtruyen.service.mess;

import java.util.List;

import vn.com.nhomtruyen.domain.Truyen;

public class TruyenMess {
	private String message;
	private Long totalTruyens;
	private List<Truyen> listTruyen;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getTotalTruyens() {
		return totalTruyens;
	}
	public void setTotalTruyens(Long totalTruyens) {
		this.totalTruyens = totalTruyens;
	}
	public List<Truyen> getListTruyen() {
		return listTruyen;
	}
	public void setListTruyen(List<Truyen> listTruyen) {
		this.listTruyen = listTruyen;
	}
	
}
