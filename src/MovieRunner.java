import javax.swing.JOptionPane;

public class MovieRunner {
public static void main(String[] args) {
	Movie mo = new Movie("Star Wars",4);
	
	System.out.println(mo.getTitle());
	System.out.println(mo.getRating());
	System.out.println(mo.toString());
	System.out.println(mo.getTicketPrice());
	
	Movie o = new Movie("Scream",3);
	
	System.out.println(o.getTitle());
	System.out.println(o.getRating());
	System.out.println(o.toString());
	System.out.println(o.getTicketPrice());
	
	Movie m = new Movie("Twilight",1);
	
	System.out.println(m.getTitle());
	System.out.println(m.getRating());
	System.out.println(m.toString());
	System.out.println(m.getTicketPrice());
	
	Movie mov = new Movie("Iron Man",4);
	
	System.out.println(mov.getTitle());
	System.out.println(mov.getRating());
	System.out.println(mov.toString());
	System.out.println(mov.getTicketPrice());
	
	Movie v = new Movie("Sharknado",2);
	
	System.out.println(v.getTitle());
	System.out.println(v.getRating());
	System.out.println(v.toString());
	System.out.println(v.getTicketPrice());
	
	NetflixQueue NQ = new NetflixQueue();
	
	NQ.addMovie(mo);
	NQ.addMovie(m);
	NQ.addMovie(o);
	NQ.addMovie(mov);
	NQ.addMovie(v);
	Movie best = NQ.getBestMovie();
	JOptionPane.showMessageDialog(null, "The best movie is " + best);
	NQ.sortMoviesByRating();
	NQ.printMovies();
	Movie Sec = NQ.getMovie(1);
	JOptionPane.showMessageDialog(null, "The second best movie is " + Sec);
	

	
	
}
}
