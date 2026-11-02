// Улучшенная версия "системы принятия решений"

import java.util.Random;

class AskMe2 {
	// TODO
}

class Question {
	Random rand = new Random();

	Answer ask() {
		int prob = (int) (100 * rand.nextDouble());

		if (prob < 15) return Answer.MAYBE;		
		if (prob < 30) return Answer.NO;		
		if (prob < 60) return Answer.YES;		
		if (prob < 75) return Answer.LATER;		
		if (prob < 98) return Answer.SOON;
		else return Answer.Never		
	}
}

enum Answers {
	NO, YES, MAYBE, LATER, SOON, NEVER
}
