// Короткая демонстрация использования пакета
package bookpack;
	// теперь эти члены защищенные
	protected String title;
	protected String author;
	protected int pubDate;

	public Book(String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}

	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}
