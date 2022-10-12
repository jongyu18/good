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
			System.out.println("아이디 입력 : ");
			String id = sc.next();
			
			System.out.println("비밀번호 입력 : ");
			String password = sc.next();
			
			//get(key) -> value 값 반환
			//get("myid") -> "1234"
			//containskey() -> 존재유무  확인(true,false)
			
			if(!map.containsKey(id)) {
				System.out.println("아이디가 존재하지 않습니다. 다시입력하시오");
				continue;
			}else {
				if(!(map.get(id)).equals(password)) {
					System.out.println("비밀번호가 틀립니다. 다시입력하시오");
				}else {
					System.out.println("로그인 성공");
					break;
				}
			}
			
			
		}
 //==========================================================================
		
		
		
		
		
		
		
	}

}
