/**
 * Establishes connection to the database and retrieves, updates or deletes data from the databse.
 * 
 * @author Irfan_Hanafi
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class VehicleDAO {
	
	private static Connection getDBConnection()
	{
		Connection dbConnection = null;
		try {
			Class.forName("org.sqlite.JDBC");
		}
		catch(ClassNotFoundException e) {
			System.out.print(e.getMessage());
		}
		
		try {
			String dbURL = "jdbc:sqlite:vehicles.sqlite";
			dbConnection = DriverManager.getConnection(dbURL);
			return dbConnection;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return dbConnection;
	}
	
	public ArrayList<Vehicle> getAllVehicles() throws SQLException {
		System.out.print("Retrieving all vehicles...");
		Connection dbConnection = null;
		Statement statement = null;
		ResultSet result = null;
		String query = "Select * FROM vehicles;";
		Vehicle temp = null;
		ArrayList<Vehicle> vehicleList = new ArrayList<>();
		
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println("DBQuery = " + query);
			result = statement.executeQuery(query);
			while(result.next())
			{
				int vehicle_id = result.getInt("vehicle_id");
				String make = result.getString("make");
				String model = result.getString("model");
				int year = result.getInt("year");
				int price = result.getInt("price");
				String license_number = result.getString("license_number");
				String colour = result.getString("colour");
				int number_doors = result.getInt("number_doors");
				String transmission = result.getString("transmission");
				int mileage = result.getInt("mileage");
				String fuel_type = result.getString("fuel_type");
				int engine_size = result.getInt("engine_size");
				String body_style = result.getString("body_style");
				String condition = result.getString("condition");
				String notes = result.getString("notes");
				
				vehicleList.add(new Vehicle(vehicle_id, make, model, year, price, 
						license_number, colour, number_doors, transmission, mileage,
						fuel_type, engine_size, body_style, condition, notes));
			}
		} finally {
			if (result != null) { result.close(); }
			if (statement != null) { statement.close(); }
			if (dbConnection != null) { dbConnection.close(); }
		}
		
		return vehicleList;
	}


	public Vehicle getVehicle(int vehicle_id)
	{
		//InsertCode
		return null;
	}
	
	public Boolean deleteVehicle(int vehicle_id)
	{
		//InsertCode
		return null;
	}
	
	public Boolean insertVehicle(Vehicle v)
	{
		//InsertCode
		return null;
	}
	
	public Boolean updateVehicle(Vehicle v, int vehicle_id)
	{
		//InsertCode
		return null;
	}
}