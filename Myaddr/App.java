package ch12.unit02.addr;

public class App {
	public static void main(String[] args) {
		
		MyDuplicationException de = new MyDuplicationException();
		AddressUI ui = new AddressUI(de);
		ui.menu();
	}
}