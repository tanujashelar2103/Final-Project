package com.atm;
import java.util.Scanner;

	public class ATM {
	    private Account account;

	    public ATM(Account account) {
	        this.account = account;
	    }

	    public void start() {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("ATM Menu:");
	            System.out.println("1. View Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Balance: " + account.getBalance());
	                    break;
	                case 2:
	                    System.out.print("Enter amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    account.deposit(depositAmount);
	                    System.out.println("Amount deposited: " + depositAmount);
	                    break;
	                case 3:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    account.withdraw(withdrawAmount);
	                    System.out.println("Amount withdrawn: " + withdrawAmount);
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid option. Try again.");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Account account = new Account(1000.0); // Initial balance
	        ATM atm = new ATM(account);
	        atm.start();
	    }
	}


