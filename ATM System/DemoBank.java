package bankmanagement;
public class DemoBank 
{
	private String userId;
	private int pinNumber;
	private String accountType;
	private double accountBalance;
	private int accountNumber=000000000000;
	private StringBuffer statement=new StringBuffer();
	
	public int getAccountNumber() 
	{
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public DemoBank(String userId, int pinNumber, String accountType, double accountBalance) 
	{
		this.userId = userId;
		this.pinNumber = pinNumber;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	/*
	void writeOnExcel(int i)
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("people.csv",true);
			PrintWriter pw=new PrintWriter(fos);
			pw.println(i+accountNumber+userId+"****"+accountType+accountBalance);
			pw.close();
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	*/
	public StringBuffer getStatement() {
		return statement;
	}
	public void setStatement(String string)
	{
		this.statement.append(System.lineSeparator());
		this.statement.append(string);
	}
	public double getAccountBalance() 
	{
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) 
	{
		this.accountBalance = accountBalance;
	}
	public DemoBank() 
	{
		this.userId = null;
		this.pinNumber = 0000;
	}
	public String getAccountType()
	{
		return accountType;
	}
	public void setAccountType(String accountType) 
	{
		this.accountType = accountType;
	}
	public String getUserId() 
	{
		return userId;
	}
	public void setUserId(String userId) 
	{
		this.userId = userId;
	}
	public int getPinNumber()
	{
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) 
	{
		this.pinNumber = pinNumber;
	}
	
	public void displayDetails (int i)
	{
		System.out.println("|_______|_______________|_______________|_______|_______________|_______________|");
		System.out.println("|" +i+"\t|"+this.accountNumber+ "\t\t|"+userId+"\t|**** \t|"+accountType+" |\t"+accountBalance+" |");
	}
}
