import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class KisoKadai2 {
	public static void main(String[] args){
		//ƒ^ƒCƒgƒ‹
		System.out.print("”“–‚ÄƒQ[ƒ€");
		
		int x;
		int cnt=1;
		//ƒ‰ƒ“ƒ_ƒ€ƒNƒ‰ƒX‚ÌƒCƒ“ƒXƒ^ƒ“ƒX‰»
		int r=new java.util.Random().nextInt(100)+1;
		
		
		System.out.print("<ˆê‰ñ–Ú>");
		
		while (true){
			System.out.print("‚P`‚P‚O‚O‚Ü‚Å‚Ì”š‚ğ“ü‚ê‚Ä‚­‚¾‚³‚¢");
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			try{		
			         String buf=br.readLine();
			         x=Integer.parseInt(buf);
			         if(x>100||x<1){
			        	  System.out.println("‚P`‚P‚O‚O‚Ü‚Å‚Å‚·");
			        	  continue;
			         }
		} catch(Exception e){
			         System.out.println("”š‚Å‚·‚æA‚·‚¤‚¶");
			         continue;
		}
		    if(x>r){
		    	System.out.println("³‰ğ‚Í‚»‚ê‚æ‚è¬‚³‚¢");
		    	cnt++;
		    	System.out.println("<"+cnt+"‰ñ–Ú");
		   }else if(x<r){
			    System.out.println("³‰ğ‚Í‚»‚ê‚æ‚è‚‚¢");
			    cnt++;
			    System.out.println("<"+cnt+"‰ñ–Ú");
		   }else{
			    System.out.println("³‰ğ");
			    System.out.println(cnt+"‰ñ–Ú‚Å³‰ğ‚Å‚·");
			    break;
		   }	    
			  
			    
		   }
     }
}	
		
	
