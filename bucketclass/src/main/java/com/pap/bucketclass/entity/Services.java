package com.pap.bucketclass.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

import com.pap.bucketclass.model.PostServiceModel;
import com.pap.bucketclass.support.BooleanToLongConverter;
import com.pap.bucketclass.support.PriceStringToIntegerPriceConverter;
import com.pap.bucketclass.util.ConverterPackage;

@Entity
@Table(name="service")
public class Services implements Serializable{
	
	//Primary Key
	@Id
	@Column(name="service_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long serviceId;

	//Foreign Key
	@Column(name="member_id")
	@NotNull
	private String memberId;
	
	//서비스 제목
	@Column(name="service_title")
	@NotNull
	private String serviceTitle;

	//은행이름
	@Column(name="account_bank")
	@NotNull
	private String accountBank;
	
	//계좌번호
	@Column(name="account_number")
	@NotNull
	private String accountNumber;
	
	//서비스 템플릿 삭제
	@Column(name="service_isDelete")	
    @Convert(converter = BooleanToLongConverter.class)
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
	@NotNull
	private String serviceDescription;
	
	//서비스 등록일
	@Column(name="service_register_date")
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date serviceRegisterDate;
	
	//서비스 활성화
	@Column(name="service_register_isActive")
	@NotNull
    @Convert(converter = BooleanToLongConverter.class)
	private Boolean serviceRegisterIsActive;
	
	//서비스 가격
	@Column(name="service_price")
	@NotNull
	@Convert(converter = PriceStringToIntegerPriceConverter.class)
	private String servicePrice;
	
	//서비스 날짜 설명(예 : 매주 월수금 총 10회)
	@Column(name="service_date_description")
	@NotNull
	private String serviceDateDescription;

	//서비스 시작 날짜
	@Column(name="service_start_date")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date serviceStartDate;
	
	//서비스 종료 날짜
	@Column(name="service_end_date")
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date serviceEndDate;
	/*********************************************************************************/
	/*
	 * Service -- ServiceCategory
	 */
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private ServiceCategory serviceCategory;
    
	/*
	 * Service -- ServiceAddress
	 */
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id")
	private ServiceAddress serviceAddress;
    
	/*
	 * service -- [wishlist] -- member
	 */
	@ManyToMany(mappedBy = "services")
	private Set<Member> members = new HashSet<>();
    /*********************************************************************************/
	
	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
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

	public void setServiceImgUri(String serviceImgUri) {
		this.serviceImgUri = serviceImgUri;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public Date getServiceRegisterDate() {
		return serviceRegisterDate;
	}

	public void setServiceRegisterDate(Date serviceRegisterDate) {
		this.serviceRegisterDate = serviceRegisterDate;
	}

	public Boolean getServiceRegisterIsActive() {
		return serviceRegisterIsActive;
	}

	public void setServiceRegisterIsActive(Boolean serviceRegisterIsActive) {
		this.serviceRegisterIsActive = serviceRegisterIsActive;
	}

	public String getServicePrice() {
		return servicePrice;
	}

	public void setServicePrice(String servicePrice) {
		this.servicePrice = servicePrice;
	}

	public String getServiceDateDescription() {
		return serviceDateDescription;
	}

	public void setServiceDateDescription(String serviceDateDescription) {
		this.serviceDateDescription = serviceDateDescription;
	}

	public Date getServiceStartDate() {
		return serviceStartDate;
	}

	public void setServiceStartDate(Date serviceStartDate) {
		this.serviceStartDate = serviceStartDate;
	}

	public Date getServiceEndDate() {
		return serviceEndDate;
	}

	public void setServiceEndDate(Date serviceEndDate) {
		this.serviceEndDate = serviceEndDate;
	}

	public ServiceCategory getServiceCategory() {
		return serviceCategory;
	}

	public void setServiceCategory(ServiceCategory serviceCategory) {
		this.serviceCategory = serviceCategory;
	}

	public ServiceAddress getServiceAddress() {
		return serviceAddress;
	}

	public void setServiceAddress(ServiceAddress serviceAddress) {
		this.serviceAddress = serviceAddress;
	}
    
	/**
	 * 서비스 저장하기 위한 Methods
	 * 기존의 정보 (서비스 템플릿) + 새로운 정보 (새로 입력받은 정보)
	 */
	
	/*
	 * 서비스를 만들기 위해 클라이언트로부터 JSON으로 요청받은 새로운 정보들을 Service 엔터티에 저장
	 */
	public void setNewDataToPostService(PostServiceModel newInputModel) {
		this.servicePrice = newInputModel.getServicePrice();
		this.serviceDateDescription = newInputModel.getServiceDateDescription();
		this.serviceStartDate = ConverterPackage.convertDateStringToTimestamp(newInputModel.getServiceStartDate());
		this.serviceEndDate = ConverterPackage.convertDateStringToTimestamp(newInputModel.getServiceEndDate());
	}
	/*
	 * 기존에 있는 Service_template으로부터 정보를 불러와 Service 엔터티에 저장
	 */
	public void setDateFromTemplate(ServiceTemplate templateModel) {
		this.serviceTitle = templateModel.getServiceTitle();
		this.accountBank = templateModel.getAccountBank();
		this.accountNumber = templateModel.getAccountNumber();
		this.serviceIsDelete = templateModel.getServiceIsDelete();
		this.hashTag = templateModel.getHashTag();
		this.serviceModifiedDate = templateModel.getServiceModifiedDate();
		this.serviceImgUri = templateModel.getServiceImgUri();
		this.serviceDescription = templateModel.getServiceDescription();
	}
	
}
