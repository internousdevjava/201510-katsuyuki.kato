import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class KisoKadai2 {
	public static void main(String[] args){
		//�^�C�g��
		System.out.print("�����ăQ�[��");
		
		int x;
		int cnt=1;
		//�����_���N���X�̃C���X�^���X��
		int r=new java.util.Random().nextInt(100)+1;
		
		
		System.out.print("<����>");
		
		while (true){
			System.out.print("�P�`�P�O�O�܂ł̐��������Ă�������");
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			try{		
			         String buf=br.readLine();
			         x=Integer.parseInt(buf);
			         if(x>100||x<1){
			        	  System.out.println("�P�`�P�O�O�܂łł�");
			        	  continue;
			         }
		} catch(Exception e){
			         System.out.println("�����ł���A������");
			         continue;
		}
		    if(x>r){
		    	System.out.println("�����͂����菬����");
		    	cnt++;
		    	System.out.println("<"+cnt+"���");
		   }else if(x<r){
			    System.out.println("�����͂����荂��");
			    cnt++;
			    System.out.println("<"+cnt+"���");
		   }else{
			    System.out.println("����");
			    System.out.println(cnt+"��ڂŐ����ł�");
			    break;
		   }	    
			  
			    
		   }
     }
}	
		
	
