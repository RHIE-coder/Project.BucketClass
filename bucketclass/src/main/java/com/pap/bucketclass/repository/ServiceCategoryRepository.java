package com.pap.bucketclass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pap.bucketclass.entity.ServiceCategory;
@Repository
public interface ServiceCategoryRepository extends JpaRepository<ServiceCategory, Long> {
	
	//카테고리 아이디로 찾기
	ServiceCategory findByCategoryId(Long category_id);
}
