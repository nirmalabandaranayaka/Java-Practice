class Books{
	private String title;
	private String author;
	private String publisher;
	private String city;
	private String date;
	private ISBN isbnNum;
	private double price;
	
	public Books(String title,String author,String publisher,String city,String date,ISBN isbnNum,double price)
	{
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.city=city;
		this.date=date;
		this.isbnNum=isbnNum;
		this.price=price;
	}
	public void setISBN(String isbn)
	{
		isbnNum.setisbn(isbn);
	}
	public String getauthor()
	{
		return this.author;
	}
	public String getisbnNum()
	{
		return isbnNum.getisbn();
	}
	public void printdetails()
	{
		System.out.println("Book Title:"+title);
		System.out.println("Book Author:"+author);
		System.out.println("Publisher:"+publisher);
		System.out.println("ISBN:"+getisbnNum());
	}
}