package ex02variable;

/*
반지름이 10인 원의 넓이를 구해 출력하시오.
단, 면애의 타입을 int, float, double형
세가지로 선언하여 각각 출력해야한다.
변수명] 
	int형 : area_int
	float형 : area_float
	double형 : area_double
공식]
	원의넓이 = 반지름 * 반지름 * 3.14
                        
 */
public class Qu_03 {

	public static void main(String[] args) {
		
		int area_int,r=10;
		float area_float;
		double area_double;
		
		area_int = r * r * (int)3.14;
		area_float = (float)(r * r *3.14);
		area_double = r * r * 3.14;
		System.out.printf("int의 원의 넓이 %d%nfloat의 원의 넓이 %.2f%ndouble의 원의 넓이 %.2f",
				area_int, area_float,area_double);
	
	}

}
