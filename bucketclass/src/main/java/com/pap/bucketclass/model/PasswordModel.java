package com.pap.bucketclass.model;

/**
 * 비밀번호 Valid를 위한 모델
 */
public class PasswordModel {
	
	private String memberPassword;
	private String newPassword;
	private String checkPassword;
	
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getCheckPassword() {
		return checkPassword;
	}
	public void setCheckPassword(String checkPassword) {
		this.checkPassword = checkPassword;
	}
	
	

}
