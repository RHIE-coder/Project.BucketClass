package com.pap.bucketclass.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.pap.bucketclass.support.BooleanToLongConverter;
import com.pap.bucketclass.support.JsonArrayToStringConverter;
/**
 * service_template table : 서비스 템플릿
 */
@Entity
@Table(name="service_template")
public class ServiceTemplate implements Serializable{ 
	
	//Primary Key
	@Id
	@Column(name="service_template_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long serviceTemplateId;
	
	//서비스 제목
	@Column(name="service_title")
	@NotNull
	private String serviceTitle;

	//은행이름
	@Column(name="account_bank")
	private String accountBank;
	
	//계좌번호
	@Column(name="account_number")
	private String accountNumber;
	
	//서비스 템플릿 삭제
	@Column(name="service_isDelete")
    @Convert(converter = BooleanToLongConverter.class)
	@NotNull
	private Boolean serviceIsDelete;
	
	//해쉬태그
	@Column(name="hashTag")
	private String hashTag; //JSON
	
	//서비스 수정일
	@Column(name="service_modified_date")
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date serviceModifiedDate;
	
	//서비스 이미지
	@Column(name="service_img_uri")
	private String serviceImgUri; //JSON
	
	//서비스 설명
	@Column(name="service_description")
	private String serviceDescription;
	/*********************************************************************************/
	/*
	 * ServiceTemplate -- Member
	 */
	@JsonManagedReference
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="member_id")
	private Member member;
	
	/*
	 * ServiceTemplate -- ServiceCategory
	 */
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private ServiceCategory serviceCategory;
    /*********************************************************************************/
	public Long getServiceTemplateId() {
		return serviceTemplateId;
	}

	public void setServiceTemplateId(Long serviceTemplateId) {
		this.serviceTemplateId = serviceTemplateId;
	}

	public String getServiceTitle() {
		return serviceTitle;
	}

	public void setServiceTitle(String serviceTitle) {
		this.serviceTitle = serviceTitle;
	}

	public String getAccountBank() {
		return accountBank;
	}

	public void setAccountBank(String accountBank) {
		this.accountBank = accountBank;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Boolean getServiceIsDelete() {
		return serviceIsDelete;
	}

	public void setServiceIsDelete(Boolean serviceIsDelete) {
		this.serviceIsDelete = serviceIsDelete;
	}

	public String getHashTag() {
		return hashTag;
	}

	public void setHashTag(String hashTag) {
		this.hashTag = hashTag;
	}

	public Date getServiceModifiedDate() {
		return serviceModifiedDate;
	}

	public void setServiceModifiedDate(Date serviceModifiedDate) {
		this.serviceModifiedDate = serviceModifiedDate;
	}

	public String getServiceImgUri() {
		return serviceImgUri;
	}

	public void setServiceImgUri(String  serviceImgUri) {
		this.serviceImgUri = serviceImgUri;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public ServiceCategory getServiceCategory() {
		return serviceCategory;
	}

	public void setServiceCategory(ServiceCategory serviceCategory) {
		this.serviceCategory = serviceCategory;
	}
    
}
