public class Book extends TangibleAsset{
	private Striing isbn;

	public book(String name,int price,String color,String isbn){
		super(name,price,color);
		this.isbn = isbn;
	}

	public String getIsbn(){return this.isbn;}

}
