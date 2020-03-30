package Collection;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ass40 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fis=new FileReader("C:\\Users\\Lenovo\\workspace\\Ivavsys\\abc");
		BufferedReader br=new BufferedReader(fis);
		int lineno=1;
		do
		{
			String line=br.readLine();
			System.out.println(lineno+":"+line);
			lineno++;
			if(line==null)
				break;
			
		}while(true);

	}

}
