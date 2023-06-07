package Jun_2023;

public class 푸드파이트대회 {
	
	public static String solution(int[] food) {
		String answer = "";
		String tmp = "";
		
		System.out.println(food.length);
		
		for(int i=1; i < food.length; i++) {
			for(int j=0; j < food[i]/2; j++) {
				answer += i;
			}
		}
		
		for(int i=answer.length()-1; i >= 0; i--) {
			tmp += answer.charAt(i);
		}
		
		answer += 0;
		answer += tmp;
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] food = {1, 3, 4, 6};
		String result = solution(food);
		System.out.println(result);
	}
	
}
