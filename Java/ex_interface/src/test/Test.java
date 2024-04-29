package com.java.india.test;

import com.java.india.dm.DataManager;
import com.java.india.dp.DataPrinter;
import com.java.india.dp.JDialogDataPrinter;
import com.java.india.ds.DataSource;
import com.java.india.ds.DefaultDataSource;

public class Test {

	public static void main(String[] args) {
		
		DataSource ds = new DefaultDataSource();
		DataPrinter dp1 = new JDialogDataPrinter();
		DataManager dm = new DataManager(ds, dp1);
		dm.process();
		
	}

}
