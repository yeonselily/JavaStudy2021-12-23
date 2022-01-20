package a20_컬렉션;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>(); 
		arrayList.add("안녕");
		arrayList.add("하세");
		arrayList.add("요.");
		
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		System.out.println("0인덱스 값: "+ arrayList.get(0));
		
		for(int i = 0; i < arrayList.size(); i++ ) {
			System.out.println(i + "인덱스 값: "+ arrayList.get(i));
		}
		
		for(String str: arrayList) {
			System.out.println(str);
		}
		
		System.out.println(arrayList.remove(1)); 
		System.out.println(arrayList);
		
		String[] array1 = {"안녕", "하세", "요."}; 
		array1[1] = null; 
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] == null && (i+1) != array1.length ) {
				array1[i] = array1[i+1]; 
				array1[i + 1] = null; 
			}
		}
		int count = 0; 
		for(String str: array1) {
			if(str != null) {
				count++;
			}
		}
		
		String[] array2 = new String[count]; 
		for(int i = 0; i < array2.length; i++) {
			array2[i] = array1[i];
			System.out.println(array2[i]);
		}

	}

}
