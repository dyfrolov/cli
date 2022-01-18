import view.cliview.*;

public class CalculatorTestAppl {
	static InputOutput inputOutput=new ConsoleInputOutput();
	static String format = "yyyy-MM-dd";
	
public static void main(String[] args) {
	Item []items= {new CalculateItem(inputOutput),
			new DaysBetweenItem(inputOutput, format),
			new DateAfterBeforeItem(inputOutput, format),
			new ExitItem()};
	Menu menu=new Menu(items, inputOutput);
	menu.runMenu();
}

}
