package com.pap.bucketclass.model;

import java.io.Serializable;
/**
 * JSON 형태로 클라이언트로부터 요청을 받는 커맨드 객체
 */
public class RequestModel implements Serializable {
	
	private String req;

	public String getReq() {
		return req;
	}
	
	public void setReq(String req) {
		this.req = req;
	}
	
	public void setNickname(String req) {
		this.req = req;
	}
	

	public void setMemberId(String req) {
		this.req = req;
	}
	

	public void setMemberEmail(String req) {
		this.req = req;
	}

	@Override
	public String toString() {
		return "req : " + req;
	}
	
	
	
}
