package hackerrank.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FraudPrevention {

    public static class purchaseUserData {
	int orderId, dealId;
	String email, address, city, state, zipCode, creditCard;

	public purchaseUserData(String data) {
	    String[] arr = data.split(",");
	    orderId = Integer.parseInt(arr[0]);
	    dealId = Integer.parseInt(arr[1]);
	    email = arr[2].replace(".", "")
		    .replaceAll("\\+[0-9a-zA-Z]*+@", "@");
	    address = arr[3].toLowerCase().replace("st.", "street").replace("rd.", "road");
	    city = arr[4];
	    state = arr[5].toLowerCase().replaceAll("(^il$)", "illinois")
		    .replaceAll("(^ca$)", "california").replaceAll("(^ny$)", "new york");
	    zipCode = arr[6].replace("-", "");
	    creditCard = arr[7];
	}

	public boolean isPurchaseFraudulent(purchaseUserData data2) {
	    if (data2.email.equalsIgnoreCase(email) && data2.dealId == dealId
		    && !data2.creditCard.equalsIgnoreCase(creditCard))
		return true;
	    if (data2.address.equalsIgnoreCase(address)
		    && data2.city.equalsIgnoreCase(city)
		    && data2.state.equalsIgnoreCase(state)
		    && data2.zipCode.equalsIgnoreCase(zipCode)
		    && data2.dealId == dealId
		    && !data2.creditCard.equalsIgnoreCase(creditCard))
		return true;
	    return false;
	}
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sc.nextLine();
	purchaseUserData[] array = new purchaseUserData[n];
	List<Integer> frauds = new ArrayList<>();
	for (int i = 0; i < n; i++) {
	    array[i] = new purchaseUserData(sc.nextLine());
	}
	for (int i = 0; i < n - 1; i++) {
	    for (int j = i + 1; j < n; j++) {
		if (array[i].isPurchaseFraudulent(array[j])) {
		    if (!frauds.contains(array[i].orderId))
			frauds.add(array[i].orderId);
		    if (!frauds.contains(array[j].orderId))
			frauds.add(array[j].orderId);
		}
	    }
	}
	Collections.sort(frauds);
	Iterator<Integer> it = frauds.iterator();
	while (it.hasNext()) {
	    System.out.print(it.next() + (it.hasNext() ? "," : ""));
	}

    }

}
