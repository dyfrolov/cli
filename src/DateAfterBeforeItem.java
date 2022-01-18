import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import view.cliview.InputOutput;
import view.cliview.Item;

public class DateAfterBeforeItem implements Item{
	InputOutput inputOutput;
	List<String> optionsList = new ArrayList<>();
	String format;
	
	public DateAfterBeforeItem(InputOutput inputOutput, String format) {
		super();
		this.inputOutput = inputOutput;
		this.format = format;
		this.optionsList.add("after");
		this.optionsList.add("before");
	}

	@Override
	public String displayedName() {
		return "Calculate date by adding or substracting days from initial one";
	}

	@Override
	public void perform() {
		LocalDate initDate = inputOutput.inputDate("Enter initial date in format "+format, format);
		if(initDate==null)//cancel was typed
			return;
		Long days=inputOutput.inputLong("Enter number of days");
		if(days==null)
			return;
		String option=inputOutput.inputString("Enter operation "+optionsList, optionsList);
		if(option==null)
			return;
		inputOutput.outputLine(option.equals("after")?initDate.plusDays(days).toString():initDate.minusDays(days).toString());
	}
}
