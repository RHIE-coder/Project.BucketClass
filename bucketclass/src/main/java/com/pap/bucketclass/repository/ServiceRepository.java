package com.pap.bucketclass.repository;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pap.bucketclass.entity.Services;
@Repository
public interface ServiceRepository extends JpaRepository<Services, Long> {
	
	//서비스 아이디로 찾기
	public Services findByServiceId(Long serviceId);
	
	//7개의 키워드로 검색
	public Page<Services> findByServiceTitleLikeAndServiceCategory_CategorySubjectLikeAndServiceCategory_CategoryTypeLikeAndServiceCategory_CategoryPeriodLikeAndServiceCategory_CategoryScaleLikeAndServiceCategory_CategoryPlaceLike(
			String serviceTitle, 
			String categorySubject,
			String categoryType,
			String categoryPeriod,
			String categoryScale,
			String categoryPlace,
			Pageable pageable);

	//시작 날짜와 종료 날짜로 대기중, 진행중, 완료됨을 나누기 위해 있는 JPA 메서드
	//@Query("SELECT * FROM service WHERE current_ BETWEEN service_start_date AND service_end_date;")
	public Page<Services> findByServiceStartDateBeforeAndServiceEndDateAfter(Date firstDate, Date secondDate, Pageable pageable);
	
}
