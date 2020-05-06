package daily.string;

public class ExcelSheetColumn {
	
	public static int ssCode(final String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			System.out.println("s.charAt(i) - 'A' : "+s.charAt(i));
			System.out.println(s.charAt(i) - 'A');
			result = result * 26 + s.charAt(i) - 'A' + 1;
		}
		return result;
	}
	
	public static String ssColumn(int s) { 
		StringBuilder result=new StringBuilder();;
		int alp=0;
        while(s!=0) { 
           s=s%10; 
           result.append((char)'A'+s + alp*26);
           System.out.println(result);
           s=s/10;
        }
        
        return result.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelSheetColumn E=new ExcelSheetColumn(); 
		E.ssCode("D");
		E.ssColumn(702);
	}
}
