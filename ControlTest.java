
public class ControlTest {

	public static void main(String[] args) {
		SimpleControlSb control=new SimpleControlSb();
		SleepingBagAction sleepingBagAction=new SleepingBagAction();
		control.setCommand(sleepingBagAction::open);
		control.usingIt();
		control.setCommand(sleepingBagAction::close);
		control.usingIt();

	}

}
