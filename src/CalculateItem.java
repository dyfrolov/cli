import java.util.HashMap;
import java.util.function.BinaryOperator;

import view.cliview.InputOutput;
import view.cliview.Item;

public class CalculateItem implements Item {
InputOutput inputOutput;
static HashMap<String,BinaryOperator<Integer>> mapOperations;
static {
	mapOperations=new HashMap<>();
	mapOperations.put("+", (a,b)->a+b);
	mapOperations.put("*", (a,b)->a*b);
	mapOperations.put("-", (a,b)->a-b);
	mapOperations.put("/", (a,b)->a/b);
}
	@Override
	public String displayedName() {
		return "Integer numbers arithmetics calculator";
	}

	@Override
	public void perform() {
		Integer op1=inputOutput.inputInteger("Enter first number");
		if(op1==null)
			return;
		Integer op2=inputOutput.inputInteger("Enter second number");
		if(op2==null)
			return;
		String operation=inputOutput.inputString("Enter operation "
			+mapOperations.keySet());
		inputOutput.outputLine(mapOperations.get(operation)
				.apply(op1, op2));

	}

	public CalculateItem(InputOutput inputOutput) {
		super();
		this.inputOutput = inputOutput;
	}

}
