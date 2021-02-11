import java.io.*;
import java.util.Scanner;

public class Test {
	public static void main(String[] args)throws IOException{
		//BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		int[] day0={0,1,2,3,4,5,6,7,8,9,10,11,12};
		int[] day01={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		String[] day1={"","元旦","b","c","","","","","","","","","","","","","","","","","","","","","","","","","","","","a"};
		String[] day2={"","d","e","f","","","","","","","","建国記念日","","","","","","","","","","","","天皇誕生日","","","","","","","",""};
		String[] day3={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
		String[] day4={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","昭和の日","",""};
		String[] day5={"","","","憲法記念日","みどりの日","こどもの日","","","","","","","","","","","","","","","","","","","","","","","","","",""};
		String[] day6={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
		String[] day7={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
		String[] day8={"","","","","","","","","","","","山の日","","","","","","","","","","","","","","","","","","","",""};
		String[] day9={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
		String[] day10={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
		String[] day11={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
		String[] day12={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};

		/*for(int q=0;q<13;q++){
			day1[q]=day1[q]+1;
			System.out.println(day1[q]);
		}*/
		//anniversary(day1,day2);
		
		Scanner a = new Scanner(System.in);
		System.out.println("月を入力してください");
			int month = a.nextInt();
		System.out.println("日にちを入力してください");
			int day = a.nextInt();

			for(int u=0;u<day0.length;u++){
				//月から求める
				if(month==day0[u]){
					int abc=day0[u];
					for(int i=1;i<day01.length;i++){
						if(abc==1){
							if(day==day01[i]){
							System.out.println(month+"月"+day+"日は"+day1[i]+"です");
							}
						}
						if(abc==2){
							if(day==day01[i]){
								System.out.println(month+"月"+day+"日は"+day2[i]+"です");
							}
						}
						if(abc==3){
							if(day==day01[i]){
								System.out.println(month+"月"+day+"日は"+day3[i]+"です");
							}
						}
						if(abc==4){
							if(day==day01[i]){
								System.out.println(month+"月"+day+"日は"+day4[i]+"です");
							}
						}
						if(abc==5){
							if(day==day01[i]){
								System.out.println(month+"月"+day+"日は"+day5[i]+"です");
							}
						}
						if(abc==6){
							if(day==day01[i]){
								System.out.println(month+"月"+day+"日は"+day6[i]+"です");
							}
						}
						if(abc==7){
							if(day==day01[i]){
								System.out.println(month+"月"+day+"日は"+day7[i]+"です");
							}
						}
						if(abc==8){
							if(day==day01[i]){
								System.out.println(month+"月"+day+"日は"+day8[i]+"です");
							}
						}
						if(abc==9){
							if(day==day01[i]){
								System.out.println(month+"月"+day+"日は"+day9[i]+"です");
							}
						}
						if(abc==10){
							if(day==day01[i]){
								System.out.println(month+"月"+day+"日は"+day10[i]+"です");
							}
						}
						if(abc==11){
							if(day==day01[i]){
								System.out.println(month+"月"+day+"日は"+day11[i]+"です");
							}
						}
						if(abc==12){
							if(day==day01[i]){
								System.out.println(month+"月"+day+"日は"+day12[i]+"です");
							}
						}
					}
				}
						
			}
			if(month>12){
				System.out.println("月の入力が間違っています。");
				System.out.println("入力された月= "+month+"月");
			}else if(month==0){
				System.out.println("月の入力が間違っています。");
				System.out.println("入力された月= "+month+"月");
			}
			if(day>31){
				System.out.println("日にちの入力が間違っています。");
				System.out.println("入力された日にち= "+day+"日");
			}else if(day==0){
				System.out.println("日にちの入力が間違っています。");
				System.out.println("入力された日にち= "+day+"日");
			}

	}
	//public static void anniversary(String day1[], String day2[]) {
			//System.out.println(day1[0]);
		//}
		
}