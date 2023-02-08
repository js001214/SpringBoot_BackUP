package com.mysite.sbb2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@NoArgsConstructor	
@RequiredArgsConstructor


public class HelloLombok4 {

	
	private final String name;
	private int age;	
	
	public static void main(String[] args) {
		
		//RequiredArgsConstructor final 값만 가져온다
		HelloLombok4 lombok = new HelloLombok4("주성");
		
		//출력
		
		System.out.println(lombok.name);
		
		//ToString
		
		System.out.println(lombok);
		
		
		
		
		
		
	}

}