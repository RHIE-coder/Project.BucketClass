package com.pap.bucketclass.util;
/**
 * JSON으로 들어오는 것은 문자, 숫자, 참거짓 밖에 없음.
 * String으로 들어온 날짜를 DB에 저장하기 위해 날짜 형식으로 Convert 한후 UTC기준으로 Timestamp으로 저장한다.
 */
public enum ParserForDate{
		//DATE:		2  0  1  7  0  8  2  7  1  8  1  2  0  0
		//INDEX:	    0  1  2  3  4  5  6  7  8  9  10 11 12 13
		YEAR(0,4){
			@Override
			public int parse(String date) {
				return Integer.parseInt(date.substring(getStartIndex(),getEndIndex()).trim());}
		}
		, MONTH(4,6){
			@Override
			public int parse(String date) {
				return Integer.parseInt(date.substring(getStartIndex(),getEndIndex()).trim());}
		}
		, DAY(6,8){
			@Override
			public int parse(String date) {
				return Integer.parseInt(date.substring(getStartIndex(),getEndIndex()).trim());}
		}
		, HOUR(8,10){
			@Override
			public int parse(String date) {
				if(date.equals("24")) {
					date="00";
				}
				System.out.println("date : " + date);
				return Integer.parseInt(date.substring(getStartIndex(),getEndIndex()).trim());}
		}
		, MINUTE(10,12){
			public int parse(String date) {
				return Integer.parseInt(date.substring(getStartIndex(),getEndIndex()).trim());}	
		}
		, SECOND(12,14){
			public int parse(String date) {
				return Integer.parseInt(date.substring(getStartIndex(),getEndIndex()).trim());}
		}
		;

		protected final int startIndex;
		protected final int endIndex;

		ParserForDate(int startIndex, int endIndex){
			this.startIndex = startIndex;
			this.endIndex = endIndex;
		}

		public int getStartIndex() {
			return startIndex;
		}

		public int getEndIndex() {
			return endIndex;
		}

		public abstract int parse(String date);
	}