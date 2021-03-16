package quiz;
/*

반지름이 10인 원의 넓이를 구해 출력하시오.
단, 면애의 타입을 int, float, double형
세가지로 선언하여 각각 출력해야한다.
int형 : area_int
    float형 : area_float
    double형 : area_double

 */
public class Qu_02_03 {

	public static void main(String[] args) {

		double PI = 3.14;
		
		int r = 10;
		
		int area_int = (int)(PI * r *r);
		float area_float = (float)(PI * r *r); 
		double area_double = PI * r *r;
		
		System.out.println("area_int: "+area_int);
		System.out.println("area_float: "+area_float);
		System.out.println("area_double: "+area_double);
		
	}

}
