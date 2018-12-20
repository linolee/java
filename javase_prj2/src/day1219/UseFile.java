package day1219;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UseFile {

	public UseFile() {
		String path = "c:/dev/temp/java_read.txt";
		//1.생성
		File file = new File(path);
		System.out.println(file);
		if(file.exists()) {
			System.out.println("절대 경로 : "+file.getAbsolutePath());
			try {
				System.out.println("규범 경로 : "+file.getCanonicalPath());
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("경로 : "+file.getPath());
			System.out.println("폴더명 : "+file.getParent());
			System.out.println("파일명 : "+file.getName());
			System.out.println(file.isFile()?"파일":"디렉토리");
			System.out.println(file.isDirectory()?"디렉토리":"파일");
			System.out.println("파일길이 : "+file.length()+"byte");
			System.out.println("실행"+(file.canExecute()?"가능":"불가능"));
			System.out.println("읽기"+(file.canRead()?"가능":"불가능"));
			System.out.println("쓰기"+(file.canWrite()?"가능":"불가능"));
			System.out.println(file.isHidden()?"숨김파일":"일반파일");
			Date d = new Date(file.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
			System.out.println("마지막 수정일 : "+sdf.format(d));
			
		}else {
			System.out.println("경로를 확인해주세요.");
		}
	}
	
	public static void main(String[] args) {
		new UseFile();
	}

}
