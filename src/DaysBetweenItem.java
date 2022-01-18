import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import view.cliview.InputOutput;
import view.cliview.Item;

public class DaysBetweenItem implements Item {

	InputOutput inputOutput;
	String format;
	
	
	public DaysBetweenItem(InputOutput inputOutput, String format) {
		super();
		this.inputOutput = inputOutput;
		this.format = format;
	}

	@Override
	public String displayedName() {
		return "Calculate number of days between dates";
	}

	@Override
	public void perform() {
		LocalDate initDate = inputOutput.inputDate("Enter initial date in format "+format, format);
		if(initDate==null)//cancel was typed
			return;
		LocalDate finDate = inputOutput.inputDate("Enter final date in format "+format, format);
		if(finDate==null)//cancel was typed
			return;
		inputOutput.outputLine(ChronoUnit.DAYS.between(initDate, finDate));
	}

}
