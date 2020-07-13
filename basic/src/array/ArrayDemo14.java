package array;

import java.util.Scanner;

public class ArrayDemo14 {
	public static void main(String[] args) {
		/*
		야구 게임
		1~9까지의 임의의 수 3개를 가진 배열
		사용자로부터 숫자 3개를 입력받아 순서대로 배열에 저장
		사용자가 입력한 숫자와 임의의 숫자들을 비교
		숫자 동일, 인덱스 동일시 strike
		숫자 동일, 인덱스 불일치시 ball
			최대 10회 시도 가능
			출력값이 3s0b인 경우 사용자가 숫자를 모두 맞힌 경우
		*/
		
		Scanner sc = new Scanner(System.in);
		
		// 임의의 숫자 3개를 저장하는 배열
        int[] secret = new int[3];
        
        // 사용자가 입력한 숫자 3개를 저장하는 배열
        int[] input = new int[3];
        
        // 1~9 사이 임의의 숫자를 secret에 순서대로 저장
        for (int i=0; i<secret.length; i++) {
            int random = (int) (Math.random()*9 + 1);
            
            // secret에 중복된 숫자 저장되지 않게 하기
            boolean isExist = false;
            for (int j=0; j<i; j++) {
            	// 새로 발생한 난수와 secret의 배열값을 순서대로 비교
                if (random == secret[j]) {
                	// 동일한 숫자가 발견되면 isExist를 true로 설정
					// 숫자를 비교하는 for문을 탈출
                    isExist = true;
                    break;
                }
            }
            
            // ★ 조건이 만족하지 않으면(!isExist가 false면) else문, 조건이 만족하면(!isExist가 true면) if문 실행            
            if (!isExist) { 
            	// 중복이 없었으므로 난수를 배열에 저장
                secret[i] = random;
            } else {
            	// 이번에 뽑은 난수가 중복이였으므로 다시 뽑기 위해 i를 1 감소시킴
                i--;
            }
        }
        
        // 던진 횟수
        int throwCount = 1;
        
        while (true) {
            if (throwCount > 10) {
                System.out.println("시도 횟수가 10회를 초과하였습니다.");
                break;
            }

            int strikeCount = 0;
            int ballCount = 0;
            
            // input의 숫자를 하나씩 가져와서 secret의 숫자와 비교
            System.out.print("첫번째 숫자를 입력하세요 : ");
            input[0] = sc.nextInt();
            System.out.print("두번째 숫자를 입력하세요 : ");
            input[1] = sc.nextInt();
            System.out.print("세번째 숫자를 입력하세요 : ");
            input[2] = sc.nextInt();

            for (int i=0; i<input.length; i++) {
                for (int j=0; j<secret.length; j++) {
                	// 동일한 숫자 발견시
                    if (input[i] == secret[j]) {
                    	// 인덱스 동일 여부 확인
                        if (i == j) {
                            strikeCount++;
                        } else {
                            ballCount++;
                        }
                    }

                }
            }

            System.out.println(strikeCount + "S " + ballCount + "B");
            if (strikeCount == 3) {
                System.out.println("정답입니다.");
                break;
            } else {
                throwCount++;
            }

        }

        sc.close();
    }
}
