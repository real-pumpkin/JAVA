package ch08.unit06;

public class Ex05 {
	public static void main(String[] args) {
		Store st = new Store();
		
		Orange o = new Orange();
		st.sell(o);
		
		st.sell(new Apple());
	}
}

interface Fruit {
	public String getName();
	public int getPrice();
}

class Apple implements Fruit {
	@Override
	public String getName() {
		return "사과";
	}

	@Override
	public int getPrice() {
		return 3000;
	}
}

class Orange implements Fruit {
	@Override
	public String getName() {
		return "오렌지";
	}

	@Override
	public int getPrice() {
		return 1000;
	}
}

class Store {
	public void sell(Fruit ft) {
		System.out.println(ft.getName() + " -> " + ft.getPrice());
	}
}
