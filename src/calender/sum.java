package calender;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		int i;
		int j;
		Scanner scanner = new Scanner(System.in);
	    String s1, s2;
		s1 = scanner.next();
		s2 = scanner.next();
		System.out.println(s1+s2);
		i =Integer.parseInt(s1);
		j =Integer.parseInt(s2);
		System.out.println(i+j);
		
		System.out.printf("%d 와 %d의 합은 %d 입니다",i,j, i+j);
		scanner.close();//릭이 나지 않기 위해 
		
	}

}
