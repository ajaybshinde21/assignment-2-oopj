
public class Main {
	public static void main(String[] args) {
		Author charlesPetzold = new Author("Charles Petzold", "press@theannotatedturing.com", 'M');
		Book codeBook = new Book("Code: The Hidden Language of Computer Hardware and Software", charlesPetzold, 1199.0, 2);

		System.out.print(codeBook.toString());
		
	}

}
