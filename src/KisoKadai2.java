import java.io.BufferedReader;
import java.io.InputStreamReader;


public class KisoKadai2 {
	public static void main(String[] args){
		//タイトル
		System.out.print("数当てゲーム");
		
		int x;
		int cnt=1;
		//ランダムクラスのインスタンス化
		int r=new java.util.Random().nextInt(100)+1;
		
		
		System.out.print("<一回目>");
		
		while (true){
			System.out.print("１～１００までの数字を入れてください");
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			try{		
			         String buf=br.readLine();
			         x=Integer.parseInt(buf);
			         if(x>100||x<1){
			        	  System.out.println("１～１００までです");
			        	  continue;
			         }
		} catch(Exception e){
			         System.out.println("数字ですよ、すうじ");
			         continue;
		}
		    if(x>r){
		    	System.out.println("正解はそれより小さい");
		    	cnt++;
		    	System.out.println("<"+cnt+"回目");
		   }else if(x<r){
			    System.out.println("正解はそれより高い");
			    cnt++;
			    System.out.println("<"+cnt+"回目");
		   }else{
			    System.out.println("正解");
			    System.out.println(cnt+"回目で正解です");
			    break;
		   }	    
			  
			    
		   }
     }
}	
		
	