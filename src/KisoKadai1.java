
import java.io.*; 
 public class KisoKadai1 { 
 	public static void main(String[] args) { 
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         //�ϐ������߂āA������
         int x = 0;  
         int y = 0;  
           
         //while���g����x,y�̃��[�v���쐬�i�����̌���j
         while(x < 1 || 100 < x){ 
         	try{ 
         		System.out.println("x��1~100�̒l����͂��Ă��������B"); 
         		x = 0;  
         		System.out.print("x="); 
         		x = Integer.parseInt(br.readLine()); 
         	}catch(Exception e){ 
         		System.out.println("�����ɂ��Ă��������B"); 
         	} 
         } 
          
         while(y < 1 || 100 < y){  
         	try{ 
         		System.out.println("y��1~100�̒l����͂��Ă��������B"); 
         		y = 0;  
         		System.out.print("x="+x+" y="); 
         		y = Integer.parseInt(br.readLine()); 
         	}catch(Exception e){ 
         		System.out.println("�����ɂ��Ă��������B"); 
         	} 
         } 
 
 
         //���\�̍쐬
         for(int j=y;j>=1;j--){ 
         for(int k=1;k<=x;k++); 
         for(int i=1;i<=x;i++);
         } 
 	} 
 
 
 	
 	           
 	} 
 
 





