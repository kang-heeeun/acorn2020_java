package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 *  HashMap<key 값의 type, value 값의 type>
		 *  
		 *  key의 generic class는 String으로 지정하는것이 일반적이다
		 *  value 의 generic class는 담을데이터 type을 지정하면 된다
		 *  여러개의 type을 섞어서 담을거면 object로 지정하면 된다 
		 */
		Map<String, Object> map1 = new HashMap<>();
		// object, abstractMap, Hashmap, serializavle, cloneable, map
		
		map1.put("num", 1); //sting int
		map1.put("name", "김구라");//string string
		map1.put("addr", "노량진");//string string
		/*
		 *  value 의 Generic 클래스가 Object 로 지정 되어 있기때문에
		 *  리턴되는 Object type 을 원래 type 으로 casting 해야 한다. 
		 */
		int num=(int)map1.get("num");
		String name=(String)map1.get("name");
		String addr=(String)map1.get("addr");
	}
}








