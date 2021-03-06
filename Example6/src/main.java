import java.util.Scanner;

import accountmanagement.Account;
import accountmanagement.LimitAccount;
import accountmanagement.RegisterMoves;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Integer option = -1;
		Account account = new Account(0.0);
		LimitAccount limitaccount = new LimitAccount(0.0);
		do {
			System.out.println("1.-) Crear Cuenta Normal");
			System.out.println("2.-) Crear Cuenta Limitada");
			System.out.println("3.-) Extraer dinero");
			System.out.println("4.-) Agregar Dinero");
			System.out.println("5.-) Mostrar");
			System.out.println("6.-) Mostrar Movimientos");
			System.out.println("7.-) Salir");
			
			option = Integer.parseInt(scanner.nextLine());
			switch (option) {
				case 1 : {
					System.out.println("Estas creando una cuenta normal");
					System.out.println("Agregue el saldo inicial");
					Double balance =  Double.parseDouble(scanner.nextLine());
					System.out.println(balance);
					account = new Account(balance);
					break;
				}
				case 2 : {
					System.out.println("Estas creando una cuenta Limitada");
					System.out.println("Agregue el saldo inicial");
					Double balance =  Double.parseDouble(scanner.nextLine());
					limitaccount = new LimitAccount(balance);
					break;
				}
				case 3 : {
					if (account != null) {
						System.out.println("Cuanto desea retirar");
						Double money =  Double.parseDouble(scanner.nextLine());
						account.extractBalance(money);
					}
					if (limitaccount != null) {
						System.out.println("Cuanto desea retirar limit");
						Double money =  Double.parseDouble(scanner.nextLine());
						limitaccount.extractBalance(money);
					}
					break;
				}
				case 4 : {
					if (account != null) {
						System.out.println("Cuanto desea agregar");
						Double money =  Double.parseDouble(scanner.nextLine());
						account.addBalance(money);
					}
					if (limitaccount != null) {
						System.out.println("Cuanto desea agregar limit");
						Double money =  Double.parseDouble(scanner.nextLine());
						limitaccount.addBalance(money);
					}					
					break;
				}
				case 5 : {
					if (account != null) {
						System.out.println(account.getBalance());
					}
					if (limitaccount != null) {
						System.out.println(limitaccount.getBalance());
					}
					break;
				}
				case 6: {
					System.out.println("Movimientos registrados");
					System.out.println("Cuenta Normal");
					for(RegisterMoves item : account.getRegisterMovesList()) {
						System.out.println(item.getDate().toString() + " hrs " 
					+ item.getTime().toString() + " " 
					+ item.getType() + " " 
					+ item.getMoney());
					}
					System.out.println("Cuenta Limitada");
					for(RegisterMoves item : limitaccount.getRegisterMovesList()) {
						System.out.println(item.getDate().toString() + " hrs " 
					+ item.getTime().toString() + " " 
					+ item.getType() + " " 
					+ item.getMoney());
					}
					break;
				}
			}
			
		} while (option != 7);
	}

}
