package daily.string;

public class Anagram {
public int[] anagramMappings(int[] A, int[] B) {
        
        int p[]=new int[A.length];
        for(int i=0;i<A.length;i++) { 
        
            for(int j=0;j<B.length;j++) { 
               if(A[i] == B[j]) { 
                
                   p[i]=j;
                   break;
               
               }
            }
        
        }
        
      return p;  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram C=new Anagram(); 
		int A[]= {12,28,46,32,50};
		int B[]= {50,12,32,46,28};
		
		System.out.println(C.anagramMappings(A, B));
	}

}
