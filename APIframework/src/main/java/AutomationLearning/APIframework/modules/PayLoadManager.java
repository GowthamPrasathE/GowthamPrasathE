package AutomationLearning.APIframework.modules;

import com.google.gson.Gson;

import AutomationLearning.APIframework.pojos.Booking;
import AutomationLearning.APIframework.pojos.BookingDates;

public class PayLoadManager {
	
	Gson gson;
	
	public String createpayload() {
		
		
		
		Booking booking = new Booking();
		
		booking.setFirstname("Gowtham");
		booking.setLastname("Prasath");
		booking.setTotalprice(34);
		booking.setDepositpaid(true);
		
		
		BookingDates bookingdates = new BookingDates();
		bookingdates.setCheckin("01/01/2024");
		bookingdates.setCheckout("01/09/2024");
		booking.setBookingdates(bookingdates);
		booking.setAdditionalneeds("Breakfast");
		gson = new Gson();
		return gson.toJson(booking);
	};
	
	
	
}
