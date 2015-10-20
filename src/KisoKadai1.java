
import java.io.*; 
 public class KisoKadai1 { 
 	public static void main(String[] args) { 
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         //変数を決めて、初期化
         int x = 0;  
         int y = 0;  
           
         //whileを使ってx,yのループを作成（条件の決定）
         while(x < 1 || 100 < x){ 
         	try{ 
         		System.out.println("xに1~100の値を入力してください。"); 
         		x = 0;  
         		System.out.print("x="); 
         		x = Integer.parseInt(br.readLine()); 
         	}catch(Exception e){ 
         		System.out.println("数字にしてください。"); 
         	} 
         } 
          
         while(y < 1 || 100 < y){  
         	try{ 
         		System.out.println("yに1~100の値を入力してください。"); 
         		y = 0;  
         		System.out.print("x="+x+" y="); 
         		y = Integer.parseInt(br.readLine()); 
         	}catch(Exception e){ 
         		System.out.println("数字にしてください。"); 
         	} 
         } 
 
 
         //九九表の作成
         for(int j=y;j>=1;j--){ 
         for(int k=1;k<=x;k++); 
         for(int i=1;i<=x;i++);
         } 
 	} 
 
 
 	
 	           
 	} 
 
 





