// Короткая демонстрация использования пакета
package bookpack;

class Book {
	private String title;
	private String author;
	private int pubDate;

	Book(String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}

	void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}
