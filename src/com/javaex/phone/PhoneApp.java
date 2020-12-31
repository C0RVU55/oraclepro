package com.javaex.phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) {
		// DB 미니 프로젝트 : 전화번호 관리 프로그램 2
		// 리스트 등록 수정 삭제 검색 종료

		// while문 탈출 변수
		boolean run = true;

		// 변수
		String name, hp, company;
		int id;

		// 클래스 선언
		PhoneDao pDao = new PhoneDao();
		Scanner sc = new Scanner(System.in);

		// 화면(타이틀)
		System.out.println("******************************************");
		System.out.println("*          전화번호 관리 프로그램        *");
		System.out.println("******************************************");

		// 실행
		while (run) {

			pDao.view(); // 화면(메뉴)

			int num = sc.nextInt();

			switch (num) {

			case 1:
				System.out.println("<1.리스트>");

				List<PhoneVo> pList = new ArrayList<PhoneVo>();
				pList = pDao.getList();

				for (int i = 0; i < pList.size(); i++) {
					PhoneVo vo = pList.get(i);
					System.out.println(
							vo.getPersonId() + ". " + vo.getName() + "   " + vo.getHp() + "   " + vo.getCompany());
				}
				break;

			case 2:
				System.out.println("<2.등록>");

				System.out.print("이름 > ");
				name = sc.next();
				System.out.print("휴대전화 > ");
				hp = sc.next();
				System.out.print("회사번호 > ");
				company = sc.next();

				PhoneVo inVo = new PhoneVo(name, hp, company);
				pDao.phoneInsert(inVo);

				break;

			case 3:
				System.out.println("<3.수정>");

				System.out.print("번호 > ");
				id = sc.nextInt();
				System.out.print("이름 > ");
				name = sc.next();
				System.out.print("휴대전화 > ");
				hp = sc.next();
				System.out.print("회사번호 > ");
				company = sc.next();

				PhoneVo upVo = new PhoneVo(id, name, hp, company);
				pDao.phoneUpdate(upVo);

				break;

			case 4:
				System.out.println("<4.삭제>");
				System.out.print(">번호 : ");
				id = sc.nextInt();

				pDao.phoneDelete(id);

				break;

			case 5:
				System.out.println("<5.검색>");

				System.out.print("검색어 > ");
				String str = sc.next();

				List<PhoneVo> searchList = new ArrayList<PhoneVo>();
				searchList = pDao.getList(str);

				for (int i = 0; i < searchList.size(); i++) {
					PhoneVo vo = searchList.get(i);
					System.out.println(
							vo.getPersonId() + ". " + vo.getName() + "   " + vo.getHp() + "   " + vo.getCompany());
				}
				break;
				
			case 6:
				System.out.println("******************************");
				System.out.println("*          감사합니다        *");
				System.out.println("******************************");

				run = false;
				break;

			default:
				System.out.println("[다시 입력해주세요.]");
				break;
			}

		}

		sc.close();

	}

}
