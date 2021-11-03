class Lesson1 {
    public static void main(String[] args) { 
	    printThreeWords();
		checkSumSign();
		printColor();
		compareNumbers();
	}
	
	public static void printThreeWords() {
        System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
    } 
	
	public static void checkSumSign() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		
		if (sum >= 0) {
			System.out.println("Сумма положительная");
		} else {
			System.out.println("Сумма отрицательная");
		}
	}
	
	public static void printColor() {
		int value = 10;
		
	    if (value <= 0) {
		    System.out.println("Белый");
        } else if (value > 0 & value <= 10) {
			System.out.println("Синий");
		} else {
			System.out.println("Красный");
		}
	}	
	public static void compareNumbers() {
		int a = 1;
		int b = 10;
		
		if (a >= b) {
			System.out.println("a >= b");
		} else {
			System.out.println("a < b");
		}
	}	
 }  
 