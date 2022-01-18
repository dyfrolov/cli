package view.cliview;

public class SubMenuItem implements Item{
	String displayedName;
	InputOutput inputOutput;
	Item[] items;
	
	@Override
	public String displayedName() {
		
		return displayedName;
	}
	@Override
	public void perform() {
		Menu menu = new Menu(items, inputOutput);
		menu.runMenu();
	}
	public SubMenuItem(Item[] items, InputOutput inputOutput,String displayedName ) {
		super();
		this.displayedName = displayedName;
		this.inputOutput = inputOutput;
		this.items = items;
	}

}
