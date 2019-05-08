package internals;

public class Movie<T extends Comparable<? super T>> implements IMedia<T> {

	private static final String type = "Movie";
	private String movieName;
	private int price;
	private int releaseYear;
	private String directorName;
	private String actorName;
	private String actressName;

	/**
	 * Default constructor for Movie class
	 * 
	 * @param movieName    - name of the movie
	 * @param price        - price of the movie
	 * @param releaseYear  - release year of the movie
	 * @param directorName - name of the director
	 * @param actorName    - if there is an actor (if not make it null)
	 * @param actressName  - if there is an actress (if not make it null)
	 */
	public Movie(String movieName, int price, int releaseYear, String directorName, String actorName,
			String actressName) {

		this.movieName = movieName;
		this.price = price;
		this.releaseYear = releaseYear;
		this.directorName = directorName;
		this.actorName = actorName;
		this.actressName = actressName;
	}
	
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", price=" + price + ", releaseYear=" + releaseYear + ", directorName="
				+ directorName + ", actorName=" + actorName + ", actressName=" + actressName + "]";
	}

	public String getDirector() {
		return this.directorName;
	}
	
	public String getActor() {
		return this.actorName;
	}
	
	public String getActress() {
		return this.actressName;
	}

	@Override
	public String mediaName() {
		return this.movieName;
	}

	@Override
	public String mediaType() {
		return Movie.type;
	}

	@Override
	public int mediaPrice() {
		return this.price;
	}

	@Override
	public int mediaYear() {
		return this.releaseYear;
	}

}