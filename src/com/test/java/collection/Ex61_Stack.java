package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex61_Stack {
	
	public static void main(String[] args) {
		
		//Ex61_Stack.java
		
		/*
		 	
		 	자료구조(컬렉션)
		 	- 물리적인 특징 (내부구조)
		 	- 추상적인 특징 (사용법)
		 	
		 
		 ADT
		 - Abstract Data Type
		 - Stack, Queue
		 
		  List
		  - ArrayList
		  - Queue
		  - Stack
		  
		  Stack
		  - 후입선출
		  - LIFO : Last Input First Output
		  - 저장소에 나중에 들어간 요소가 가장 먼저 나온다.
		  ex) 메모리 구조 (Stack)
		  ex) 되돌리기 (Ctrl+Z),다시하기(Ctrl+Y)
		  
		  
		  
		  Queue
		  - 선입선출
		  - FIFO:FIRST Input First Output
		  - 저장소에 먼저 들어간 요소가 먼저 나온다.
		  ex) 줄서기
		  
		 */
		
//		m1();
		//m2();
		m3();
		
	}

	private static void m3() {
		// - 선입 선출
		Queue<String> queue = new LinkedList<String>();
		
		//1. 요소 추가하기
		//- boolean add(T value)
		queue.add("짜장면");
		queue.add("짬뽕");
		queue.add("탕수육");
		
		//2. 요소 개수
		//- int size()
		System.out.println(queue.size()); //3
		//3.요소 읽기(꺼내기)
		
		System.out.println(queue.poll()); //짜장면
		System.out.println(queue.size()); //2
		
		System.out.println(queue.poll()); //짬뽕
		System.out.println(queue.size());//1
	
		System.out.println(queue.poll());//탕수육
		System.out.println(queue.size());//0

		System.out.println(queue.poll());//null
		System.out.println(queue.size());//0
	
		
//		System.out.println(queue.poll());
		
		
		if(queue.size() != 0) {
			System.out.println(queue.poll());
		}
		
		if (queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		//5. 요소 확인
		System.out.println(queue.peek());
		
	}

	private static void m2() {
		Stack<String> stack = new Stack<String>();
		
		stack.push("짜장면");
		stack.push("짬뽕");
		stack.push("볶음밥");
		
		//5.요소 확인(읽기 o + 삭제 x)
		System.out.println(stack.peek());//마지막으로 집어넣은 데이터 볶음밥
		System.out.println(stack.peek());//마지막으로 집어넣은 데이터 볶음밥
		System.out.println(stack.size());
		
	}

	private static void m1() {
		
		Stack<String> stack = new Stack<String>();
		
		//후입 선출
		
		//1.요소 추가하기
		//- T push(T value)
		stack.push("짜장면");
		stack.push("짬뽕");
		stack.push("볶음밥");
		
		//2.요소 개수
		//-int size()
		
		System.out.println(stack.size());
		
		//3.요소 읽기
		//-T pop()
		System.out.println(stack.pop());   //볶음밥
		System.out.println(stack.size());   //2
		
		
		System.out.println(stack.pop());   //짬뽕
		System.out.println(stack.size()); //1
		
		System.out.println(stack.pop());   //짜장면
		System.out.println(stack.size()); //0
		
//		System.out.println(stack.pop());
//		System.out.println(stack.size());
		
		//4. 스택이 비었는지?
		if (stack.size()!=0) {
			System.out.println(stack.pop());
		}
		
		if (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}

}
