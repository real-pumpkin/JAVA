package ch12.unit02.addr;

import java.util.ArrayList;
import java.util.List;

public class AddressImpl implements Address {
	private List<AddressVO> list = new ArrayList<>();
	
	@Override
	public void insertAddress(AddressVO vo) {
		if(readAddress(vo.getName(), vo.getTel()) != null) {
			throw new RuntimeException("등록된 데이터..");
		}
		list.add(vo);
	}

	@Override
	public AddressVO readAddress(String name, String tel) {
		for(AddressVO vo : list) {
			if(vo.getName().equals(name) && vo.getTel().equals(tel) ) {
				return vo;
			}
		}
		
		return null;
	}

	@Override
	public List<AddressVO> listAddress() {
		return list;
	}

	@Override
	public List<AddressVO> listAddress(String name) {
		List<AddressVO> findList = new ArrayList<>();
		
		for(AddressVO vo : list) {
			if(vo.getName().indexOf(name)!=-1) {
				findList.add(vo);
			}
		}
		
		return findList;
	}

	@Override
	public boolean deleteAddress(String name, String tel) {
		AddressVO vo = readAddress(name, tel);

		return list.remove(vo);
	}

}
