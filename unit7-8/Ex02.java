package ch07.unit08;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		String[] ss = {"서울","부산","대구","인천","광주",
				"대전","울산","세종"};
		int idx;
		
		Arrays.sort(ss);
		System.out.println("정렬후:"+ss.toString());
		
		// 이분검색 : 데이터가 정렬되어 있어야 함
		idx = Arrays.binarySearch(ss, "인천");
		System.out.println("인천:"+idx+" 인덱스에 존재");

		idx = Arrays.binarySearch(ss, "경기");
		System.out.println("경기:"+idx+" 인덱스에 존재");
			// 없으면 -1
		
	}

}
