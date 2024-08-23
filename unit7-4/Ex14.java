package ch07.unit04;

// StringBuffer와 StringBuilder
public class Ex14 {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		StringBuffer buffer = new StringBuffer();
		
		new Thread(() -> {
			for(int i=0; i<10000; i++) {
				buffer.append(i);
				builder.append(i);
			}
		}).start();
		
		new Thread(() -> {
			for(int i=0; i<10000; i++) {
				buffer.append(i);
				builder.append(i);
			}
		}).start();
		
		new Thread(() -> {
			try {
				Thread.sleep(5000);
				
				System.out.println("buffer : " + buffer.length());
				System.out.println("builder : " + builder.length());
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start();

	}

}
