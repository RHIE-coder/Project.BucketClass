package com.pap.bucketclass.model;

import java.io.Serializable;

/**
 * JSON형태로 결과 값을 보내주는 모델
 */
public class ResponseModel implements Serializable{
	
	private String res;
	
	private Long serviceId;
	
	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}
	
}
