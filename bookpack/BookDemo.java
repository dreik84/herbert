package bookpack;

class BookDemo {
	public static void main(String[] args) {
		Book[] books = new Book[5];

		books[0] = new Book("Java: A Beginner's Guide", "Schildt", 2022);
		books[1] = new Book("Java: The Complete Reference", "Schildt", 2022);
		books[2] = new Book("1984", "Orwell", 1949);
		books[3] = new Book("Red Storm Rising", "Clancy", 1986);
		books[4] = new Book("On the Road", "Kerouac", 1955);

		for (Book book : books) {
			book.show();
		}
	}
}
