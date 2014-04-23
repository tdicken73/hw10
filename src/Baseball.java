

import java.sql.SQLException;

import oracle.jdbc.driver.OracleConnection;
import oracle.sql.CustomDatum;
import oracle.sql.Datum;
import oracle.sql.STRUCT;
import oracle.sql.StructDescriptor;

public class Baseball {
	String name;
	String city;
	int year;
	String position;
	String league;
	
	public Baseball(String sName, String sCity, int yr, String sPosition, String sLeague){
		this.name = sName;
		this.city = sCity;
		this.year = yr;
		this.position = sPosition;
		this.league = sLeague;
	}
	
	
	
}
