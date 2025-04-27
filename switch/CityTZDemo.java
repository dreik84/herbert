// Получение часового пояса избранных городов
class CityTZDemo {
	
	// Использовать перечисление для описания часовых поясов
	enum TZ { Eastern, Central, Mountain, Pacific, Other }

	public static void main(String[] args) {
		
		// Массив с городами Северной Америки
		String[] cities = {
			"New York", "Boston", "Miami", "Chicago",
			"St. Louis", "Des Moines", "Denver",
			"Albuquerque", "Seattle", "San Francisco", 
			"Los Angeles", "Portland"
		};

		// Отобразить часовые пояса для каждого города
		for (String city : cities) {
			
			TZ zone = switch(city) {
			    case "New York", "Boston", "Miami" -> TZ.Eastern;
			    case "Chicago", "St. Louis", "Des Moines" -> TZ.Central;
			    case "Albuquerque", "Denver" -> TZ.Mountain;
			    case "Seattle", "San Francisco", "Los Angeles", "Portland" -> TZ.Pacific;
			    default -> TZ.Other;
			};
			
			if (zone == TZ.Other) 
				System.out.println(city + " находится за пределами");
			else System.out.println(city + " находится в поясе " + zone);
		}
	}
}
