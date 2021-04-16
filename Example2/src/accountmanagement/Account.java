package accountmanagement;
//Clase cuenta
public class Account {
	//saldo
	private Double balance;
	public Account (Double balance) {
		this.balance = balance;
	}
	public void addBalance(Double money) {
		this.balance += money;
	}
	public void extractBalance(Double money) {
		if (money < this.balance) {
			this.balance -= money;
		}
	}
	public Double getBalance() {
		return this.balance;
	}
}
