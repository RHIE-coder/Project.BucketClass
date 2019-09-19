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
 * service_category table : 서비스 카테고리
 */
@Entity
@Table(name="service_category")
public class ServiceCategory implements Serializable {
	
	//Primary Key
	@Id
	@Column(name="category_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long categoryId;
	
	//분야 (요리, 예술, 외국어, 헬스/웰빙, 비즈니스, 일상생활)
	@Column(name="category_subject")
	private String categorySubject;
	
	//타입 (체험, 교육)
	@Column(name="category_type")
	private String categoryType;
	
	//기간 (정기, 비정기)
	@Column(name="category_period")
	private String categoryPeriod;
	
	//규모 (단체, 개인)
	@Column(name="category_scale")
	private String categoryScale;
	
	//장소 (실내, 실외)
	@Column(name="category_place")
	private String categoryPlace;

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategorySubject() {
		return categorySubject;
	}

	public void setCategorySubject(String categorySubject) {
		this.categorySubject = categorySubject;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public String getCategoryPeriod() {
		return categoryPeriod;
	}

	public void setCategoryPeriod(String categoryPeriod) {
		this.categoryPeriod = categoryPeriod;
	}

	public String getCategoryScale() {
		return categoryScale;
	}

	public void setCategoryScale(String categoryScale) {
		this.categoryScale = categoryScale;
	}

	public String getCategoryPlace() {
		return categoryPlace;
	}

	public void setCategoryPlace(String categoryPlace) {
		this.categoryPlace = categoryPlace;
	}
	
	
}
