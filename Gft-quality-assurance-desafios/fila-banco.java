
import java.util.Scanner; 
 
public class Main { 
 
    public static void main(String[] args) { 
	Scanner nome = new Scanner(System.in);
    	String[] nomesFila = new String[3]; 
    	int next = 0;
    
    	for(int i = 0; i < 3; i++) {
    		String N = nome.next();
    		nomesFila[next] = N;
    		next++;
   	}
    
    	for(int i = 0; i < 3; i++) {
    		System.out.println (nomesFila[i] + " - esta na posicao: " + (i+1));
   	}
    } 
}
