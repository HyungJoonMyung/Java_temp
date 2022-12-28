package homework;

public class Customer{
	String carNumber;
	String carType;
	int parkingTime;
	float discount;
	double interimPayment;
	double Payment;

	public Customer(){}

	void initial() {
		carNumber = "";
		carType = "";
		parkingTime = 0;
		discount = 1;
		interimPayment = 0;
		Payment = 0;

	}
	void setCarnumber(String number) {
		carNumber = number;
	}
	void setCartype(String type) {
		carType = type;
	}
	void setParkingtime(int time) {
		parkingTime = time;
	}
//	void setDiscount(int )
}


public class AutoParkingPaySystem20221220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userCount = 1;
		
//		Customer[] userData;
//		userData = new Customer();
//		Customer[] userData	 = new Customer()[50];

		Customer user = new Customer();
		user.initial();
		

	}

}
