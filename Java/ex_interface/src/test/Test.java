package test;

import dm.DataManager;
import dp.DataPrinter;
import dp.JDialogDataPrinter;
import ds.DataSource;
import ds.DefaultDataSource;

public class Test {

	public static void main(String[] args) {
		
		DataSource ds = new DefaultDataSource();
		DataPrinter dp1 = new JDialogDataPrinter();
		DataManager dm = new DataManager(ds, dp1);
		dm.process();
		
	}

}
