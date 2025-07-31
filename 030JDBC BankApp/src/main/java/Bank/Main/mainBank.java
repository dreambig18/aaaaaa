package Bank.Main;

import java.util.Scanner;

import Bank.Info.AccountInfo;

public class mainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		AccountInfo ainfo=new AccountInfo();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Customer portal...");
			System.out.println("1 Register\n2 Search\n3 Display\n4 ");
			System.out.println("Enter your chouice...");
			ch=sc.nextInt();
			if (ch==1) {
				ainfo.create();
			}
			else if (ch==2) {
				System.out.println("Enter account no to search record ");
				ainfo.retrive(sc.nextInt());
			}
			
			else if (ch==3) {
				ainfo.display();
			}
		} while (sc.next().equals("yes"));
	}

}
