package com.pap.bucketclass.support;

import javax.persistence.AttributeConverter;

/**
 * MySQL은 boolean 형태로 true는 1, false는 0으로 저장됨. 그러므로 Convert가 필요하다.
 */
public class BooleanToLongConverter implements AttributeConverter<Boolean, Long>{

	//Server --> DB
	@Override
	public Long convertToDatabaseColumn(Boolean attribute) {
		return (long) (attribute ? 1 : 0);
	}

	//DB --> Server
	@Override
	public Boolean convertToEntityAttribute(Long dbData) {
		return dbData != 0;
	}
	
}
