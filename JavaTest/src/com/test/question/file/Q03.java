package com.test.question.file;

import java.io.File;
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		특정 파일을 이동하고, 중복되는 경우를 처리하시오.
		
		설계>
		1. Scanner
		2. AAA, BBB의 test.txt를 참조하는 파일 객체 생성
		3. if 존재하는지?
			>파일 이동을 실행한다는 멘트 출력
			>if 파일 이동이 되는지? renameTo() 사용
				>이동 완료
			>안 되면 같은 이름이 존재한다고 알리고 삭제 유무 물어봄.
				>String 변수 선언 후 nextLine()으로 입력 받음.
				>if문 y선택? 
					>파일 삭제 후 rename
				>n이면 작업 취소
		 */
		Scanner scan = new Scanner(System.in);
		
		File originFile = new File("C:\\java\\AAA\\data.txt");
		File newFile = new File("C:\\java\\BBB\\data.txt");
		
		if(originFile.exists()) {
			System.out.println("파일 이동을 실행합니다.");
			if(originFile.renameTo(newFile)) {
				System.out.println("파일 이동 완료");
			} else {
				System.out.println("같은 이름을 가지는 파일이 이미 존재합니다.\r\n덮어쓸까요?(y/n)");
				String select = scan.nextLine();
				
				if(select.equals("y")) {
					newFile.delete();
					originFile.renameTo(newFile);
					System.out.println("y. 파일을 덮어썼습니다.");
				} else if(select.equals("n")) {
					System.out.println("n. 작업을 취소합니다.");
				}
			}
		} else {
			System.out.println("존재하지 않는 파일입니다.");
		}
	}
}