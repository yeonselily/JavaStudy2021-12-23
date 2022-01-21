package a20_컬렉션;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("박");
		set.add("세");
		set.add("연");
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()){
			String str = iterator.next();
			
			if(str.equals("이")) {
				System.out.println(str);
			}
		}
		
		set.remove("연");
		
		System.out.println(set);
	}
	
	

}
