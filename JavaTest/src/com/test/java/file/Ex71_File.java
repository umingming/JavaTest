package com.test.java.file;

import java.io.File;
import java.util.Calendar;

public class Ex71_File {
	
	public static void main(String[] args) {
		/*
		파일, 디렉토리 조작
		파일 입출력
		
		
		 */
		
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
//		m9();
//		m10();
//		m11();
//		m12();
//		m13();
//		m14();
		m15();
		
	}

	private static void m15() {
		// TODO Auto-generated method stub
		
	}

	private static void m14() {
		
		String path = "C:\\Users\\u_011\\eclipse";
		File dir = new File(path);
		int count = 0;
		if(dir.exists()) {
			File[] list = dir.listFiles();  //부모 폴더의 목록
			for(File subfile : list) {
				if(subfile.isFile()) {
					count++;
				}
			}
			
			for(File subdir : list) {
				
				if(subdir.isDirectory()) {
					File[] sublist = subdir.listFiles();  //자식 폴더의 목록
					for(File subsubfile : sublist) {
						if(subsubfile.isFile()) {
							count++;
						}
					}
					
					for(File subsubdir : sublist) {
						if(subsubdir.isDirectory()) {
							File[] subsubsublist = subsubdir.listFiles();
							for(File subsubsubfile : subsubsublist) {
								if(subsubsubfile.isFile()) {
									count++;
								}
							}
							
							for(File subsubsubdir : subsubsublist) {
								if(subsubsubdir.isDirectory()) {
									
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count);
		
		
	}

	private static void m13() {
		String[] list = {"사과", "바나나", "포도", "파인애플", "딸기"};
		for(String item : list) {
			System.out.println(item);
		}
	}
	private static void m12() {
		String path = "C:\\Users\\u_011\\eclipse";
		File dir = new File(path);
		
		if(dir.exists()) {
//			String[] list = dir.list();
//			
//			for(int i=0; i<list.length; i++) {
//				System.out.println(list[i]);
//				File file = new File(path + "\\" + list[i]);
//				System.out.println(file.isFile() + "," + file.isDirectory());
//			}
//			File[] list = dir.listFiles();
//			for(int i=0; i<list.length; i++) {
//				System.out.println(list[i].getName() + ":" + list[i].isDirectory());
//			}
			File[] list = dir.listFiles();
			for(int i=0; i<list.length; i++) {
				if(list[i].isDirectory()) {
					System.out.println(list[i].getName());
				}
			}
			for(int i=0; i<list.length; i++) {
				if(list[i].isFile()) {
					System.out.println(list[i].getName());
				}
			}
		}
		
	}

	private static void m11() {
		File file = new File("C:\\class\\java\\file\\todo");
		if(file.exists()) {
			System.out.println(file.delete());
		}
	}

	private static void m10() {
		String path = "C:\\class\\java\\file\\user";
		String path2 = "C:\\class\\java\\file\\move\\user";
		File dir = new File(path);
		if(dir.exists()) {
			File dir2 = new File(path2);
			dir.renameTo(dir2);
		}
		
		
	}

	private static void m9() {
		String path = "C:\\class\\java\\file\\member";
		String path2 = "C:\\class\\java\\file\\user";
		File dir = new File(path);
		if(dir.exists()) {
			File dir2 = new File(path2);
			dir.renameTo(dir2);
		}
		
	}

	private static void m8() {
		Calendar c = Calendar.getInstance();
		c.set(2021, 0, 1);
		for(int i=0; i<365; i++) {
			File dir = new File("C:\\class\\java\\file\\todo\\" 
		+ String.format("%tF", c));
			dir.mkdir();
			
			System.out.printf("%tF 완료%n", c);
			c.add(Calendar.DATE, 1);
		}
		
		System.out.println(c.getActualMaximum(Calendar.MONTH));
		System.out.println(c.getActualMaximum(Calendar.DATE));
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_YEAR));
		
	}

	private static void m7() {
		String[] member = {"홍길동", "아무개", "하하하", "호호호", "후후후"};
		for(int i=0; i<member.length; i++) {
			String path = String.format("C:\\class\\java\\file\\member\\[개인폴더]%s님",
					member[i]);
			File dir = new File(path);
			dir.mkdirs();
			System.out.println(member[i] + "님 개인폴더 생성 완료");
		}
		
	}

	private static void m6() {
		/*
		폴더 조작
		
		 */
		String path = "C:\\class\\java\\file\\AAA";
		File dir = new File(path);
		if(!dir.exists()) {
			System.out.println(dir.mkdir());
		} else {
			System.out.println("이미 폴더가 존재합니다.");
		}
		
		
		
	}

	private static void m5() {
		File file = new File("C:\\class\\java\\file\\data.txt");
		if(file.exists()) {
			System.out.println(file.delete());
		} else {
			System.out.println("파일이 없습니다.");
		}
	
		
	}

	private static void m4() {
		String path = "C:\\class\\java\\file\\hello.txt";
		File file = new File(path);
		if(file.exists()) {
			File moveFile = new File("C:\\class\\java\\file\\move\\hello.txt"); 
			file.renameTo(moveFile);
			System.out.println("완료");
		} else {
			System.out.println("파일이 없습니다.");
		}
	}

	private static void m3() {
		/*
		파일 조작
		생성, 복사, 이동, 파일명 수정, 삭제
		파일명 수정하기
		 */
		String path = "C:\\class\\java\\file\\data.txt";
		File file = new File(path);
		if(file.exists()) {
			File renameFile = new File("C:\\class\\java\\file\\hello.txt"); 
			file.renameTo(renameFile);
			System.out.println("완료");
		} else {
			System.out.println("파일이 없습니다.");
		}
		
	}

	private static void m2() {
		/*
		디렉토리는 파일의 한 종류로 부피가 없는 파일
		디렉토리의 크기는 모든 파일의 합
		통상적인 디렉토리의 크기는 개발자가 직접 계산함.
		 */
		String path = "C:\\class\\java\\file";
		File dir = new File(path);
		
		if(dir.exists()) {
			
		}else {
			System.out.println("없습니다.");
		}
		
	}

	private static void m1() {
		String path = "C:\\class\\java\\file\\data.txt";
		File file = new File(path);
		System.out.println(file.exists());
		System.out.println(file.lastModified());
		
		Calendar c2 = Calendar.getInstance();
		c2.setTimeInMillis(file.lastModified());
		System.out.printf("%tF %tT", c2, c2);
		System.out.println(file.canRead());
		
		
	}

}
