package day1219;

import java.io.File;

/**
 * 파일 생성/삭제
 * @author owner
 */
public class UseFile2 {

	public void createDirectory() {
		File file = new File("c:/bonghyeon/lee");
		if(file.mkdirs()) {
			System.out.println("폴더생성 성공");
		}else {
			System.out.println("폴더생성 실패");
		}
		
	}
	
	public void removeFile() {
		File file = new File("c:/dev/temp/a.txt");
		boolean flag = file.delete();
		if (flag) {
			System.out.println("파일삭제 성공");
		}else {
			System.out.println("파일삭제 실패");
		}
	}
	
	
	
	public static void main(String[] args) {
		UseFile2 uf2 = new UseFile2();
		uf2.createDirectory();
		System.out.println("-----------------------------");
		uf2.removeFile();
	}

}
