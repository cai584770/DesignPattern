package Bulider;

import java.util.ArrayList;

public class Product {
	ArrayList<String> parts = new ArrayList<String>();
	public void Add(String part) {
		parts.add(part);
	}
	
	public void Show(){
		System.out.println("��Ʒ ���� -----");
		for(String part : parts){
			System.out.println(part);
		}
	}

}
