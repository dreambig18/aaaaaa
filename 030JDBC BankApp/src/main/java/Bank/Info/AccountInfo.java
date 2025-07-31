package Bank.Info;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Bank.Dao.AccountDao;
import Bank.Model.Account;

public class AccountInfo {
	Scanner sc=new Scanner(System.in);
	AccountDao accdao=new AccountDao();
	public List<Account> create() {
		System.out.println("Enter Account no, Account Name, Account balance :");
		Account accobj=new Account(sc.nextInt(), sc.next(), sc.nextDouble());
		List<Account>  lstacc=new ArrayList<Account>();
		lstacc.add(accobj);
		accdao.create(lstacc);
		return lstacc;
	}
public void  retrive(int accNo) {
	List<Account> lst=accdao.retrive(accNo);
	if (lst!=null) {
		Account a=(Account)lst.get(0);
		System.out.println(a.getAccNo()+"\t"+a.getCustName()+"\t"+a.getAccBal());
	}	
}
public void display() {
	List<Account> lst=accdao.diplay();
	for(Account a:lst) {
		System.out.println(a.getAccNo()+"\t"+a.getCustName()+"\t"+a.getAccBal());
	}
}

}

