package ex09package;

import java.util.Date;

import ex09package.kosmo.util.CommonUtil;

public class E01PackageMain {

	public static void main(String[] args) {

		
		Date utilDate = new Date();
		System.out.println("utilDate= "+ utilDate);
		
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		System.out.println("sqlDate= "+sqlDate);
		
		String strValue = "12312q23";
		
		boolean isNum = CommonUtil.isNumber(strValue);
		if(isNum==true) {
			System.out.println("문자열은 숫자입니다.");
		}
		else {
			System.out.println("문자열은 숫자가 아닙니다.");
		}
		
		System.out.println(ex09package.kosmo.util.CommonUtil.isNumber(strValue));
		
		
	}

}
