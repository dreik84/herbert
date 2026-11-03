// Улучшенная версия "системы принятия решений"

import java.util.Random;

class AskMe2 {
	static void answer(Answers result) {
		switch (result) {
			case NO:
				System.out.println("Нет");
				break;
			case YES:
				System.out.println("Да");
				break;
			case MAYBE:
				System.out.println("Возможно");
				break;
			case LATER:
				System.out.println("Позже");
				break;
			case SOON:
				System.out.println("Скоро");
				break;
			case NEVER:
				System.out.println("Никогда");
				break;
		}
	}

	public static void main(String[] args) {
		Question q = new Question();

		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
	}
}

class Question {
	Random rand = new Random();

	Answers ask() {
		int prob = (int) (100 * rand.nextDouble());

		if (prob < 15) return Answers.MAYBE;		
		if (prob < 30) return Answers.NO;		
		if (prob < 60) return Answers.YES;		
		if (prob < 75) return Answers.LATER;		
		if (prob < 98) return Answers.SOON;
		else return Answers.NEVER;		
	}
}

enum Answers {
	NO, YES, MAYBE, LATER, SOON, NEVER
}
