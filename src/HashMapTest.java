import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myid","1234");
		map.put("asdf","1234");
		map.put("asdf","1111");
		
		
		
	
	

		System.out.println(map);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵� �Է� : ");
			String id = sc.next();
			
			System.out.println("��й�ȣ �Է� : ");
			String password = sc.next();
			
			//get(key) -> value �� ��ȯ
			//get("myid") -> "1234"
			//containskey() -> ��������  Ȯ��(true,false)
			
			if(!map.containsKey(id)) {
				System.out.println("���̵� �������� �ʽ��ϴ�. �ٽ��Է��Ͻÿ�");
				continue;
			}else {
				if(!(map.get(id)).equals(password)) {
					System.out.println("��й�ȣ�� Ʋ���ϴ�. �ٽ��Է��Ͻÿ�");
				}else {
					System.out.println("�α��� ����");
					break;
				}
			}
			
			
		}
 //==========================================================================
		
		
		
		
		
		
		
	}

}
