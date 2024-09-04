package ch12.unit02.addr;

import java.util.Calendar;

public class MyDuplicationException {

	public boolean isValidName(String name) {  //한글 또는 영문 두글자 이상
		if(name.matches("^[가-힣a-zA-Z]{2,30}$")) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isValidtel(String tel) { //전화번호 10자리~11자리
		return tel.matches("^\\d{10,11}$");
	}
	
	
	public String formatTel(String tel) { //하이픈 없이 
		if(tel.matches("^\\d{10}$")) {
			//10자리 숫자인 경우
			return String.format("%s-%s-%s", 
					tel.substring(0,3), 
					tel.substring(3,7),
					tel.substring(7));
		}else if (tel.matches("^\\d{11}$")) {
			//11자리 숫자인 경우
			return String.format("%s-%s-%s", 
					tel.substring(0,3),
					tel.substring(3,7),
					tel.substring(7));
		}else {
			throw new IllegalArgumentException("전화번호 유효하지 않음."); //인자값 불일치.
		}
	}
	
	
	public boolean isValidBirthDate(String birthDate) {
		if (birthDate.length() != 6) {
			return false; // 6자리가 아닌경우
		}

		try {
			int year = Integer.parseInt(birthDate.substring(0, 2));
			int month = Integer.parseInt(birthDate.substring(2, 4));
			int day = Integer.parseInt(birthDate.substring(4, 6));

			// 연도 변환 로직
			int fullYear;
			if (year >= 0 && year <= 29) {
				fullYear = 2000 + year; // 2000~2029
			} else if (year >= 30 && year <= 99) {
				fullYear = 1900 + year; // 1930~1999
			} else {
				// 연도가 0~99범위 벗어나는 경우
				return false;
			}

			Calendar cal = Calendar.getInstance();
			cal.setLenient(false);
			cal.set(Calendar.YEAR, fullYear);
			cal.set(Calendar.MONTH, month - 1);
			cal.set(Calendar.DAY_OF_MONTH, day);

			cal.getTime(); // 예외가 발생하면 유효하지 않은 날짜
			return true;
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException 발생 : " + e.getMessage());
			return false;
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException 발생: " + e.getMessage());
			return false;
		}
	}
	public boolean isValidAddress(String address) {
	    try {
	        if (address == null || address.isEmpty()) {
	            return false; // 주소가 null이거나 비어있으면 false 반환
	        }
	        if (address.length() > 15) {
	            return false; // 주소의 길이가 30자를 초과하면 false 반환
	        }
	        return true; // 주소가 유효하면 true 반환

	    } catch (Exception e) {
	        e.printStackTrace();
	        return false; // 예외 발생 시 false 반환
	    }
	}
}
