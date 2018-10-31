
public class MovieRunner {
public static void main(String[] args) {
	Movie mo = new Movie("Star Wars",4);
	
	System.out.println(mo.getTitle());
	mo.getRating();
	mo.toString();
	mo.getTicketPrice();
	
}
}
