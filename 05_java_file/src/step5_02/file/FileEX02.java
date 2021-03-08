package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileEX02 {

	public static void main(String[] args) {

		
		String fileName = "ex01.txt";
		
		File file = new File(fileName);		// 파일 객체 생성
		FileReader fr = null;				// 파일 읽어오기
		BufferedReader br = null;			// 텍스트 읽어오기
		
		if (file.exists()) {
		try {

			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String data = br.readLine();
			System.out.println(data);
			
			data = br. readLine();
			System.out.println(data);
			
			// 전체 텍스트를 읽어오는 예시
			
			while (true) {
				
				data = br.readLine();
				
				if (data == null) {
					break ;
				}
			
				System.out.println(data);
				
				
			}
			
			} catch (Exception e) {
			e.printStackTrace();	
			} finally {
		
			try {br.close();} catch (IOException e) {e.printStackTrace();}
			try {fr.close();} catch (IOException e) {e.printStackTrace();}
			
			}
		}
		
	}

}
