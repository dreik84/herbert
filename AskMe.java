import java.util.Random;

class AskMe implements SharedConstants {
	public static void main(String[] args) {
		
		Question q = new Question();
		System.out.println(q.ask());
	}
}

class Question implements SharedConstants {
	
	Random random = new Random();

	int ask() {
		
		int prob = (int) (100 * random.nextDouble());

		if (prob < 30) return NO;         // 30%
		else if (prob < 60) return YES;   // 30%
		else if (prob < 75) return LATER; // 15%
		else if (prob < 98) return SOON;   // 13%
		else return NEVER;                // 2%
	}
}

interface SharedConstants {
	
	int NO = 0;
	int YES = 1;
	int MAYBE = 2;
	int LATER = 3;
	int SOON = 4;
	int NEVER = 5;
}
