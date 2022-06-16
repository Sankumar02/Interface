package com.Task_20_04_22;

public class DataBaseConnectionTester {

	public static void main(String[] args) {

		DataBaseConnector oBaseConnector = new OracleDataBase();
		oBaseConnector.connectToDataBase();

		DataBaseConnector oBaseConnector2 = new MongoDataBase();
		oBaseConnector2.connectToDataBase();

		DataBaseConnector oBaseConnector3 = new SqlServerDataBase();
		oBaseConnector3.connectToDataBase();

	}

}
