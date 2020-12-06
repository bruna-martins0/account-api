package br.com.webservice.resource.account_api;

public class Account {
	private int accountNumber;
	private String event;
	private double balance;
	private double deposit;
	
	
	public Account(String event, int accountNumber, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.event = event;
		this.deposit = initialDeposit;
		deposit(this.deposit);
	} 
	
	public Account(String event, int accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	} 
	

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getEvent() {
		return event;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double deposit) {
		this.balance += deposit;
		
	}
	
	public void withdraw(double withdraw) {
		this.balance -= withdraw;
		
	}
	
	public String toString() {
		return "Account "+ this.accountNumber +  ", Balance: $" +String.format("%.2f", balance);
	}
	
	
}

