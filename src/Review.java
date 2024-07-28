
public class Review{
	private String text;
	private double rating;
	
	public Review() {
		this.text = null;
		this.rating = 0;
	}
	
	public String getText() {
		return this.text;
	}
	
	public double getRating() {
		return this.rating;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public String toString() {
		return this.rating + "/5.0 : " + this.text;
	}

}
