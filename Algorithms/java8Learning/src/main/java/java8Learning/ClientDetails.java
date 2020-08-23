package java8Learning;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import io.github.millij.poi.SpreadsheetReadException;
import io.github.millij.poi.ss.reader.XlsReader;

public class ClientDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final File xlsxFile = new File("/Volumes/Learnings/JavaWorksapce/Students.xls");
		
	    final XlsReader reader = new XlsReader();
	    try {
			List<StudentDetails> student = reader.read(StudentDetails.class, xlsxFile);  
			
		List<String> finalResult=	student.stream().map(p->p.getFirstName()).collect(Collectors.toList());
			
			System.out.println(finalResult);
		} catch (SpreadsheetReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
