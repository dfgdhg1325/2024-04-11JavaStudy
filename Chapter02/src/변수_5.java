/*
 *  byte , char , int , long , float , double
 *  기타 : boolean 
 *  
 *  1. 데이터형의 크기
 *     byte < char < int < long < float < double
 *     => 크기의 기준 : 수 표현의 갯수
 *        1 => 1.000000
 *        
 *        int a=10L ===> x
 *        --- ----
 *         4   8
 *         long a=10; ===> int a=10 long a=10L
 *         ---- ----
 *          8    4
 *         int a='A'
 *         
 *         byte+byte =int
 *         int+int = int
 */
public class 변수_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자동 형변환 , 강제 형변환 
		int a='A';
		System.out.println(a);
		char c=65;  // int => char
		System.out.println(c); // char => double
		double d='A';

	}

}
