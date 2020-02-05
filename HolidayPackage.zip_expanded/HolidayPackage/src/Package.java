
public class Package {
	private String packageId;
	private String sourcePlace;
	private String destinationPlace;
	private double basicFare;
	private int noOfDays;
	private double packageCost;

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getSourcePlace() {
		return sourcePlace;
	}

	public void setSourcePlace(String sourcePlace) {
		this.sourcePlace = sourcePlace;
	}

	public String getDestinationPlace() {
		return destinationPlace;
	}

	public void setDestinationPlace(String destinationPlace) {
		this.destinationPlace = destinationPlace;
	}

	public double getBasicFare() {
		return basicFare;
	}

	public void setBasicFare(double basicFare) {

		this.basicFare = basicFare;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {

		this.noOfDays = noOfDays;
	}

	public double getPackageCost() {
		return packageCost;
	}

	public void setPackageCost(double packageCost) {
		this.packageCost = packageCost;
	}

	// write the required business logic methods as expected in the question
	// description
	public void calculatePackageCost() {

		double basicFare = getBasicFare();
		int days = getNoOfDays();
		int discount = 0;
		if (days <= 5) {
			discount = 0;
		} else if (days <= 8 && days > 5) {
			discount = 3;
		} else if (days > 8 && days <= 10) {
			discount = 5;
		} else if (days > 10) {
			discount = 7;
		}
		double pack = (double) basicFare * days;
		double pack1 = pack - ((pack * (double) discount) / 100);
		double packageGSt = pack1 + ((pack1 * 12) / 100);
		setPackageCost(packageGSt);
	}

}
