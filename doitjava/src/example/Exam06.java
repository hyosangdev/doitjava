package example;

public class Exam06 {

	public static void main(String[] args) {
		int multi = 1;
		int cnt = 1;
		while(cnt<11){
			multi *= cnt;
			cnt++;
		}
		System.out.println("1~10±îÁöÀÇ °ö : " + multi);
	}
}


