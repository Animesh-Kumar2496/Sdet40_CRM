package org.sdet40.practice;

import java.util.List;
import java.util.Map;

import CRM.generic.Excelutility;
import CRM.generic.IConstantPath;

public class DetchDataFromExcelUsingList {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		Excelutility excel=new Excelutility();
		excel.intilaizeExcel(IConstantPath.EXCEL_PATH);
		List<Map<String, String>> list=excel.getDataFromExcelInList("form");
		System.out.println(list.get(2).get("firstname"));

	}
}
