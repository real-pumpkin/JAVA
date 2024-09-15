package ch12.unit02.addr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.List;

public class AddressUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Address address = new AddressImpl();

	public void menu() {
		int ch;
		
		while(true) {
			try {
				do {
					System.out.println("\n\t>> 주소록 프로그램 <<");
					System.out.println("----------------------------------------");
					System.out.println("1.등록 2.수정 3.삭제 4.이름검색 5.리스트 6.종료");
					System.out.println("----------------------------------------");
					System.out.print("선택 => ");
					ch = Integer.parseInt(br.readLine());
				} while(ch<1 || ch>6);
				
				if(ch == 6) {
					return;
				}
				
				switch(ch) {
				case 1: insert(); break;
				case 2: update(); break;
				case 3: delete(); break;
				case 4: findByName(); break;
				case 5: list(); break;
				}
			} catch (Exception e) {
			}
		}
	}
	
	public void insert() {
		System.out.println("\n[데이터 등록]");
		
		AddressVO vo = new AddressVO();
		
		try {
			System.out.print("이름 ? ");
			vo.setName(br.readLine());

			System.out.print("전화번호 ? ");
			vo.setTel(br.readLine());
			
			System.out.print("생년월일 ? ");
			vo.setBirth(br.readLine());

			System.out.print("주소 ? ");
			vo.setAddr(br.readLine());
			
			String s;
			Calendar cal =  Calendar.getInstance();
			s = String.format("%tF(%tA)", cal, cal);
			vo.setRegDate(s);
		
			address.insertAddress(vo);
			
			System.out.println("등록이 완료 되었습니다. !!!");
			
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
	}
	
	public void update() {
		System.out.println("\n[데이터 수정]");

		String name, tel;
		
		try {
			System.out.print("검색할 이름 ? ");
			name = br.readLine();

			System.out.print("검색할 전화번호 ? ");
			tel = br.readLine();
			
			AddressVO vo = address.readAddress(name, tel);
			if(vo == null) {
				System.out.println("등록된 자료가 아닙니다.");
				return;
			}
			
			System.out.print("새로운 이름 ? ");
			name = br.readLine();

			System.out.print("전화번호 ? ");
			tel = br.readLine();
			AddressVO vo1 = address.readAddress(name, tel);
			
			if(vo1 != null && vo != vo1) {
				System.out.println("등록된 정보 입니다.");
				return;
			}
			
			vo.setName(name);
			vo.setTel(tel);

			System.out.print("생년월일 ? ");
			vo.setBirth(br.readLine());

			System.out.print("주소 ? ");
			vo.setAddr(br.readLine());
			
			System.out.println("수정이 완료 되었습니다. !!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
	}
	
	public void delete() {
		System.out.println("\n[데이터 삭제]");
		
		String name, tel;
		
		try {
			System.out.print("삭제할 이름 ? ");
			name = br.readLine();

			System.out.print("삭제할 전화번호 ? ");
			tel = br.readLine();
			
			boolean b = address.deleteAddress(name, tel);
			if(! b) {
				System.out.println("등록된 자료가 아닙니다.");
				return;
			}
			
			System.out.println("자료가 삭제 되었습니다. !!!");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
	}
	
	public void list() {
		System.out.println("\n[전체 리스트]");
		
		List<AddressVO> list = address.listAddress();
		System.out.println("이름\t생년월일\t\t전화번호\t\t주소\t등록일");
		System.out.println("----------------------------------------------------------------------");
		for(AddressVO vo : list) {
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getBirth() + "\t");
			System.out.print(vo.getTel() + "\t");
			System.out.print(vo.getAddr() + "\t");
			System.out.println(vo.getRegDate());
		}
		System.out.println();
	}
	
	public void findByName() {
		System.out.println("\n[이름 검색]");

		String name;
		
		try {
			System.out.print("검색할 이름 ? ");
			name = br.readLine();
			
			List<AddressVO> list = address.listAddress(name);
			
			if(list.size() == 0) {
				System.out.println("등록된 자료가 없습니다.");
				return;
			}
			
			System.out.println("이름\t생년월일\t\t전화번호\t\t주소\t등록일");
			System.out.println("----------------------------------------------------------------------");
			for(AddressVO vo : list) {
				System.out.print(vo.getName() + "\t");
				System.out.print(vo.getBirth() + "\t");
				System.out.print(vo.getTel() + "\t");
				System.out.print(vo.getAddr() + "\t");
				System.out.println(vo.getRegDate());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
	}
}
