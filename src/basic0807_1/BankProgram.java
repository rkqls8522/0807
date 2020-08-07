package basic0807_1;

import java.util.HashMap;
import java.util.Scanner;

public class BankProgram {

	private HashMap <Integer, Integer> accounts = new HashMap<>();
	private double rate = 0.01;
	private int nextacct = 0;
	private int current = 0;
	private Scanner scanner;
	private boolean done = false;
	
	private void run() {
		scanner = new Scanner(System.in);
		while(!done) {
			System.out.println("�Է�(0=������,1=�ű�,2=����,3=����,4=����,5=��Ϻ���,6=����):");
			int cnum = scanner.nextInt();
			processCommand(cnum);
		}
		scanner.close();
	}

	private void processCommand(int cnum) {

		if(cnum==0)quit();
		else if(cnum==1) newAccount();
		else if(cnum==1) select();
		else if(cnum==1) deposit();
		else if(cnum==1) authorizeLoan();
		else if(cnum==1) showAll();
		else if(cnum==1) addInterest();
		else System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	}

	private void addInterest() {
		
	}

	private void showAll() {
		
	}

	private void authorizeLoan() {
		
	}

	private void deposit() {
		
	}

	private void select() {
		
	}

	private void newAccount() {
		
	}

	private void quit() {
		
	}
	
	
	
}
