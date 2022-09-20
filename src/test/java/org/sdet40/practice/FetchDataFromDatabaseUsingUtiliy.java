package org.sdet40.practice;

import java.util.List;

import CRM.generic.DataBaseUtility;
import CRM.generic.IConstantPath;

public class FetchDataFromDatabaseUsingUtiliy {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		DataBaseUtility databaseUtility=new DataBaseUtility();
		databaseUtility.openDBConnection(IConstantPath.DB_PATH, "root", "root");
		List<String> data = databaseUtility.getDataFromDatatbase("select * from sdet40;", "emp_name");
		List<String> data1 = databaseUtility.getDataFromDatatbase("select * from sdet40;", "emp_name");
		List<String> data2 = databaseUtility.getDataFromDatatbase("select * from sdet40;", "emp_name");
		System.out.println(data1);
		System.out.println(data);
		System.out.println(data2);
	}

}
