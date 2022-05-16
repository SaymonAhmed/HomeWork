package hw3JavaVariables;

public class AboutMe {
	// Declare variable
	public byte age5;
	// Initialized variable
	public String name = "Saymon Ahmed";
	public byte age = 23;
	public short myHouseMortage = 1200;
	public int myYearlySalary = 200000;
	public long myBankBalance = 386491328741896l;
	public float myHeight = 5f;
	public double mygrade = 3.4000;
	public char sex = 'M';
	public boolean usCitizen = true;

	public static void main(String[] args) {
		AboutMe saymon = new AboutMe();
		System.out.println(" my name is " + saymon.name + "\n my age " + saymon.age + "\n my house mortage is "
				+ saymon.myHouseMortage + "\n my salary is " + saymon.myYearlySalary + "\n my bank balance is "
				+ saymon.myBankBalance);
	}
}