package com.pap.bucketclass.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pap.bucketclass.entity.ServiceTemplate;
@Repository
public interface ServiceTemplateRepository extends JpaRepository<ServiceTemplate, String> {
	//서비스 템플릿 상세보기
	public ServiceTemplate findByServiceTemplateId(Long serviceTemplateId);
	//서비스 템플릿 리스팅
	public Page<ServiceTemplate> findAll(Pageable pageable);
}
