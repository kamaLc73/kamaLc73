package dm;

import java.util.List;

import dp.DataPrinter;
import ds.DataSource;

public class DataManager {
	private DataSource ds;
	private DataPrinter dp;

	public DataManager() {
	}

	public DataManager(DataSource ds, DataPrinter dp) {
		this.ds = ds;
		this.dp = dp;
	}

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public DataPrinter getDp() {
		return dp;
	}

	public void setDp(DataPrinter dp) {
		this.dp = dp;
	}

	public void process() {
		List<String> l = ds.getData();
		dp.printData(l);
	}


}
