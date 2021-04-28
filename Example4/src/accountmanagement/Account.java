package accountmanagement;

import java.util.ArrayList;

//Clase cuenta
public class Account {
	//saldo
	private Double balance;
	private ArrayList<RegisterMoves> registerMovesList;
	public Account (Double balance) {
		this.balance = balance;
		this.registerMovesList = new ArrayList<RegisterMoves>();
	}
	public void addBalance(Double money) {
		this.balance += money;
		this.registerMovesList.add(new RegisterMoves("Trasp.Cre.", money));
	}
	public void extractBalance(Double money) {
		if (money < this.balance) {
			this.balance -= money;
			this.registerMovesList.add(new RegisterMoves("Trasp.Deb.", money));
		}
	}
	public Double getBalance() {
		return this.balance;
	}
	public ArrayList<RegisterMoves> getRegisterMovesList() {
		return registerMovesList;
	}
	
}
