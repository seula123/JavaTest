package com.test.java.data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import javax.print.DocFlavor.STRING;

public class Dummy {

	
	public static void main(String[] args) throws IOException {
		
		//학생 데이터 생성
		//-1학년
		//-3학급
		//-10명(번호)
		
		int n = 1;
		String[] name1 = {"김","이","박","최","정"};
		String[] name2 = {"길","동","재","석","명","수","진","현"
};
		
		Random rnd = new Random();
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("data\student.txt"));
		
		for (int i=1; i<=3; i++) {//학년
			for(int j=1; j<=5; j++) { //반
				
				for(int k=1; k<=10; k++) {//번호 == 학생
					
					//일렬번호, 학생명, 학년,반,번호
					String name = name1[rnd.nextInt(name1.length)]
								  + name2 [rnd.nextInt(name1.length)]
								  +name2 [rnd.nextInt(name1.length)];
					
						String s = String.format("%d,%s,%d,%d,%d\r\n"
												  ,n
												  ,name
												  ,i
												  ,j
												  ,k);
						n++;
//						System.out.println(s);
						
						writer.write(s);
					
					
				}
			}
		}//i
	}
}
