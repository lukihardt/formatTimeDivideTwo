package formatTimeDivideTwo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please input hh mm ss:");
		// TODO Auto-generated method stub
		int hour=scan.nextInt();
		int minute=scan.nextInt();
		int second=scan.nextInt();
		
//		System.out.println(hour);
//		System.out.println(minute);
//		System.out.println(second);

		int seconds=second+minute*60+hour*3600;
		double divSeconds=seconds/2.0;
//		System.out.println(divSeconds);
		
		double outHour=divSeconds/3600;
		int resulthh=(int)outHour;
		double outMinute=(divSeconds-resulthh*3600)/60;
		int resultmm=(int)outMinute;
		double outSecond=divSeconds-resulthh*3600-resultmm*60;
		
//		System.out.println(resulthh);
//		System.out.println(resultmm);
//		System.out.println(outSecond);
		System.out.println(resulthh+":"+resultmm+":"+outSecond);
		
		scan.close();
	}

}
