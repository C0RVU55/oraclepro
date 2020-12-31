package com.javaex.phone;

import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) {
		// DB 미니 프로젝트 : 전화번호 관리 프로그램 2
		
		// 리스트 등록 수정 삭제 검색 종료
		boolean run = true;
		
		PhoneDao pDao = new PhoneDao();
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			pDao.view();
			int num = sc.nextInt();
			
			switch(num) {
			
				case 1 :
					pDao.getList();
					break;
				
				default:
					break;
			}
			
			run = false;
		}

		
		
		sc.close();

	}

}
