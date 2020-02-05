
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TravelAgency {

	public List<Package> generatePackageCost(String filePath) throws InvalidPackageIdException {

		BufferedReader reader = null;

		List<Package> ar = new ArrayList<Package>();

		try {
			reader = new BufferedReader(new FileReader(filePath));

			String str = null;

			while ((str = reader.readLine()) != null) {

				String ast[] = str.split(",");
				try {

					if (validate(ast[0])) {
						Package p = new Package();
						p.setPackageId(ast[0]);
						p.setSourcePlace(ast[1]);
						p.setDestinationPlace(ast[2]);
						p.setBasicFare(Double.parseDouble(ast[3]));
						p.setNoOfDays(Integer.parseInt(ast[4]));
						p.calculatePackageCost();
						double s = p.getPackageCost();
						// System.out.println(Double.parseDouble(ast[3]) + " ,"
						// +Integer.parseInt(ast[4]));
						p.setPackageCost(s);
						ar.add(p);

					}
				} catch (InvalidPackageIdException e) {
					e.printStackTrace();
				}
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new InvalidPackageIdException(e.getMessage());
		}

		return ar;
	}

	public boolean validate(String packageId) throws InvalidPackageIdException {
		if (packageId.matches("[0-9a-zA-Z]{3}[/][0-9a-zA-Z]{3}"))
			return true;
		else
			throw new InvalidPackageIdException("Invalid Package Id");

	}

	public List<Package> findPackagesWithMinimumNumberOfDays() {

		List<Package> ar = new ArrayList<Package>();
		DBHandler db = new DBHandler();
		Connection conn;
		try {
			conn = db.establishConnection();
			PreparedStatement ps;
			ps = conn.prepareStatement(
					"select * from  package_details where no_of_days=(select min(no_of_days) from package_details)");

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Package p = new Package();
				p.setPackageId(rs.getString(1));
				p.setSourcePlace(rs.getString(2));
				p.setDestinationPlace(rs.getString(3));

				p.setNoOfDays(rs.getInt(4));
				p.setPackageCost(rs.getDouble(5));

				ar.add(p);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		return ar;
	}
}
