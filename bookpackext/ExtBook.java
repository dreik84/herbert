// Демонстрация применение protected
package bookpackext;

class ExtBook extends bookpack.Book {
	private String publisher;

	public ExtBook(String t, String a, int d, String p) {
		super(t, a, d);
		publisher = p;
	}

	public void show() {
		super.show();
		System.out.println(publisher);
		System.out.println();
	}

	// Подкласс имеет доступ к защищенным членам
	public String getTitle() { return title; }
        public void setTitle(String t) { title = t; }
	public String getAuthor() { return author; }
        public void setAuthor(String a) { author = a; }
	public int getPubDate() { return pubDate; }
        public void setPubDate(int d) { pubDate = d; }
}
