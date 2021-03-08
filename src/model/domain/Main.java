/*
 * Twenty Question For Number (숫자 스무고개) 게임
 */

package model.domain;

public class Main {
		public static void main(String[] args) {
			
		int count = 0;	
		
		System.out.println("숫자 Up/Down 게임을 시작합니다. 기회는 총"+Data.getInstance().limit_number+"번 입니다.");
		
		while(count<Data.getInstance().limit_number) {
			System.out.println("\n=========================");
			int suggestion = function.getInstance().input("수를 입력해 주세요.("+ (Data.getInstance().getStartNum()+1) +
					"~" + (Data.getInstance().getEndNum()-1) + "사이의 자연수만 입력 가능)"+" 남은횟수 : " + (Data.getInstance().limit_number - count) + "번"); //입력받은
			
			if ((suggestion>Data.getInstance().getStartNum()) && (suggestion<Data.getInstance().getEndNum())) {
				// 배열에 추가
				Data.getInstance().addArr(count, suggestion);
				// 배열의 값과 정답 비교
				if(function.getInstance().detection(suggestion)) {
					System.out.println("축하합니다. 정답을 입력하셨습니다. 게임을 종료합니다.");
					break;
				}
	
			} else {
				System.out.println("---------------------------------------------");
				System.out.println("유효하지 않은 범위입니다. 범위맞는 값을 넣어주세요.");
				System.out.println("---------------------------------------------");
				continue;
			}
			
			count += 1;
			
			// 지금까지 입력한 값 출력
			System.out.println("- - - - - -지금까지 입력한 값입니다. - - - - - -");
			Data.getInstance().printArr();
			System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - -");
			
			if (count>Data.getInstance().limit_number-1) {
				System.out.println(count + "기회를 전부 사용하셨습니다. 답은 "+ Data.getInstance().getNumber() + "였습니다. 게임을 종료합니다. ");
			}
			
			
		}
		
		
	}

}
