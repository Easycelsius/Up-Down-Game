package model.domain;

import java.util.Scanner;

public class function {
	
	private function(){};
	
	private static function instance = new function();
	static function getInstance() {
		return instance;
	}
	int range = 0;
	
//	// 문구 출력
//	public void print(String Hello) {
//		System.out.println(Hello);
//	}
	
	// 입력값 출력
	Scanner sc = new Scanner(System.in);
	public int input(String Hello){
		System.out.println(Hello);
		return sc.nextInt();
	}
	
	// 정답 판별
	public boolean detection(int YourNumber) {
		if (Data.getInstance().getNumber() == YourNumber) {
			return true;
		} else if(Data.getInstance().getNumber() > YourNumber){
			System.out.println("결과: " + YourNumber + " 보다 Up!");
			Data.getInstance().setStartNum(YourNumber);
			return false;
		} else if(Data.getInstance().getNumber() < YourNumber){
			System.out.println("결과: " + YourNumber + " 보다 Down!");
			Data.getInstance().setEndNum(YourNumber);
			return false;
		} else {
			return false;
		}

	}

}
