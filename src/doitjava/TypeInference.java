package doitjava;

public abstract class TypeInference {

	public static void main(String[] args) {
	
		var i = 100;
		var j = 10.1;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "string";
		System.out.println(str);
		
		/*
		str = 3; / 이미 var로 string 자료형으로 선언되었으므로 정수값	
		대입이 불가하다.
		*/
	}

}
