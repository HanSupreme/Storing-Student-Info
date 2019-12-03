package problemThree;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentInstance {
	
	static Student student = new Student();
	static String line;
	static Scanner sc;
	
	public static void main(String[] args) {
		
		students();
		
	}
	
	public static void students() {
		
		try {
			
			String namesLocation = ("C:\\Users\\perscholas_student\\Desktop\\names.txt");
			String gradesLocation = ("C:\\Users\\perscholas_student\\Desktop\\grades.txt");
			String gpaLocation = ("C:\\Users\\perscholas_student\\Desktop\\gpa.txt");
			
			File namesFile = new File(namesLocation);
			File gradesFile = new File(gradesLocation);
			File gpaFile = new File(gpaLocation);
			
			Scanner nameSc = new Scanner(namesFile);
			Scanner gradeSc = new Scanner(gradesFile);
			Scanner gpaSc = new Scanner(gpaFile);
			
			ArrayList<String[]> studentData = new ArrayList<String[]>();
			
			while (nameSc.hasNextLine() && gradeSc.hasNextLine() && gpaSc.hasNextLine()) {
				String[] nameLine = nameSc.nextLine().split(",");
				String[] gradeLine = gradeSc.nextLine().split(",");
				String[] gpaLine = gpaSc.nextLine().split(",");
				
				studentData.add(nameLine);
				studentData.add(gradeLine);
				studentData.add(gpaLine);
			}
			
			nameSc.close();
			gradeSc.close();
			gpaSc.close();
			
			for (String[] i : studentData) {
				System.out.println(i[0] + " | " + i[1] + " | " + i[2]);
			}
			
//			String location = ("C:\\Users\\perscholas_student\\Desktop\\names.txt");
//			File f = new File(location);
//			FileWriter fW = new FileWriter(f, true);
//			fW.write("Hello");
//			fW.close();
			
		} catch (IOException e) {
			System.out.println("Error!");
		}
		
	}
		
	}
