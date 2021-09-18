
public class SimpleControlSb {
	Command usebag;
	public SimpleControlSb() {

}
	public void setCommand(Command command) {
		usebag=command;
	}
	public void usingIt() {
		usebag.execute();
	}	
}
