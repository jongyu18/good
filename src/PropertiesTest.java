import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		
		//Properties : k -> String , v -> String
//		Properties prop = new Properties();
//		
//		prop.setProperty("myid", "1234");
//		prop.setProperty("asdf", "1111");
//		prop.setProperty("asdf", "1234");
//		
//		String value = prop.getProperty("myid");
//		System.out.println(value);
//		
//		Enumeration e = prop.propertyNames();
//		
//		while(e.hasMoreElements()) {
//			String elsement = (String)e.nextElement();
//			String value = prop.getProperty(elsement);
//			System.out.println(value);
//		}
		
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("input.txt"));
		}catch(IOException e) {
			System.out.println("지정한 파일이 없습니다.");
			
		}
		String name = prop.getProperty("name");
		String[] data = prop.getProperty("data").split(",");
		
		
		int max = 0;
		int min = 0;
		int sum = 0;
		
		//문자열 -> 숫자 : Integer.parseInt(문자열)
		//숫자 -> 문자 : String.valuof(숫자)
		
		for(int i = 0; i<data.length; i++) {
			int value = Integer.parseInt(data[i]);
			if(i==0) {
				max = min = value;
			}
			
			if(max < value) {
				max = value;
			}else if(min >value) {
				min = value;
			
			}
			sum += value;
		}
		double avg = (double)sum / data.length;
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
			

	}

}
