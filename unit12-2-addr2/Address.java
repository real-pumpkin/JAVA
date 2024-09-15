package ch12.unit02.addr2;

import java.util.List;

public interface Address {
	public void insertAddress(AddressVO vo) throws MyDuplicationException;
	public AddressVO readAddress(String name, String tel);
	public List<AddressVO> listAddress();
	public List<AddressVO> listAddress(String name);
	public boolean deleteAddress(String name, String tel);
}
