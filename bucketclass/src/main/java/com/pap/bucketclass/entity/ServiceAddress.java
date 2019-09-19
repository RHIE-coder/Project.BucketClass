package com.pap.bucketclass.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
/**
 * service_address table : 서비스 주소
 */
@Entity
@Table(name="service_address")
public class ServiceAddress implements Serializable {
	
	//Primary Key
	@Id
	@Column(name="address_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long addressId;
	
	//시,도
	@Column(name="address_state")
	@NotNull
	private String addressState;
	
	//시,군,구
	@Column(name="address_city")
	@NotNull
	private String addressCity;
	
	//동,리
	@Column(name="address_dong")
	@NotNull
	private String addressDong;

	//자세한 주소
	@Column(name="address_detail")
	private String addressDetail;

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getAddressState() {
		return addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressDong() {
		return addressDong;
	}

	public void setAddressDong(String addressDong) {
		this.addressDong = addressDong;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	
}
