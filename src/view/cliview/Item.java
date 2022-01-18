package view.cliview;

public interface Item {
String displayedName();
void perform();
default boolean isExit() {
	return false;
}
}
