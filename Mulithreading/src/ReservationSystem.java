
class TicketBooking{
	static int availableSeats = 10;
	 public synchronized void booking(String username,int requestedSeats){
		 System.out.println("Welcome "+username);
		 System.out.println(username+" has requested for "+requestedSeats+" seats");
		 System.out.println("Checking for availability..Please wait....");
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Available Seats :"+availableSeats);
		 if(requestedSeats<=availableSeats){
			 availableSeats -= requestedSeats;
			 System.out.println("For "+username+", "+requestedSeats+" seats booked successfully");
		 }else{
			 System.out.println(username+" Better you catch the bus");
		 }
		 
	 }	
}

class User extends Thread{
	private String username;
	private int requestedSeats;
	private TicketBooking ticketBooking;
	public User(String username, int requestedSeats, TicketBooking ticketBooking) {
		super();
		this.username = username;
		this.requestedSeats = requestedSeats;
		this.ticketBooking = ticketBooking;
	}
	
	public void run(){
		this.ticketBooking.booking(username,requestedSeats);
	}
	
	
}
public class ReservationSystem {

	public static void main(String[] args) {
		TicketBooking ticketBooking = new TicketBooking();
		User user1 = new User("Aayush",8,ticketBooking);
		User user2 = new User("Harsh",7,ticketBooking);
		
		user1.start();
		user2.start();
	}

}
