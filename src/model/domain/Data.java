package model.domain;

import java.util.Random;

public class Data {
	
	public int limit_number = 10; //시도 횟수
	private int startNum = 1 - 1; // 시작숫자
	private int endNum = 200 + 1; // 마지막 숫자
	
	Random random = new Random();
	private int answer_number = random.nextInt(endNum-2)+1; //난수생성
	
	private int[] prediction = new int[20]; //배열 선언
	
	private Data() {};
	private static Data instance = new Data(); //객체 활용
	static Data getInstance() {
		return instance;
	}
	
	// 숫자 얻기
	public int getNumber() {
		return answer_number;
	}
	
	// 배열에 추가하기
	public void addArr(int i, int number) {
		prediction[i] = number;
	}
	
	// 배열의 모든 값 출력하기
	public void printArr() {
		for(int i:prediction) {
			if(i != 0) {
				System.out.printf(i + " ");
			}
		}
	}

	// 범위 제한 용도
	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}
		
}
