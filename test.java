
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.*;
public class test {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int val=0;
		int n=obj.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=n;k<=(2*n)-i;k++){
				System.out.print(" ");
		}
			for(int j=1;j<=n;j++){
				switch (i%2){
				case 0:
					
					System.out.print(val);
					val--;
					break;
				case 1:
					val++;
					System.out.print(val);
					
					break;
				}
				
		}
		val=val+n;
			System.out.println();
		}
	}
}
