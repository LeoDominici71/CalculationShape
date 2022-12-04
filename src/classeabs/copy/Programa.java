package classeabs.copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Conta;
import entities.Savingconta;
import entities.businessconta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Conta> list = new ArrayList<>();
		//aqui a list e o tipo generico pq assim pode ser a lista que abre as ramificacoess
		
		
		list.add(new Savingconta(1001, "Alex", 500.00, 0.01));
		list.add(new businessconta(1002, "Maria", 1000.0, 400.0));
		list.add(new Savingconta(1004, "Bob", 300.0, 0.01));
		list.add(new businessconta(1005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for (Conta acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Conta acc : list) {
			acc.deposit(10.0);
		}
		for (Conta	acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}
		

	}


