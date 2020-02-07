package com.hometask;
import java.util.*;
public class Giftbox {

	public static void main(String[] args) {
		int choice,total_weight=0,Dairymilk_weight=180,Snickers_weight=90,Kitkat_weight=60,Laddu_weight=100,Cova_weight=40,Jilebi_weight=20,quantity;
		char addmore;
		boolean flag=true;
		Newyeargiftbox object;
		HashMap<String, Integer> mygiftbox = new HashMap<>();
		Scanner scanner_object = new Scanner(System.in);
		System.out.println("Select items in your giftbox : ");
		while(flag) {
		System.out.println("1.Dairymilk\n 2.Snickers\n 3.Kitkat\n 4.Laddu\n 5.Cova\n 6.Jilebi\n Enter your choice");
		choice=scanner_object.nextInt();
		System.out.println(choice);
		switch(choice) {
		case 1:
		System.out.println("Enter Dairymilk units : ");
		quantity=scanner_object.nextInt();
		object=new Dairymilk();
		total_weight += object.calculate_weight(Dairymilk_weight,quantity);
		mygiftbox.put("Dairymilk", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		case 2:
		System.out.println("Enter Snickers units : ");
		quantity=scanner_object.nextInt();
		object=new Snickers();
		total_weight += object.calculate_weight(Snickers_weight,quantity);
		mygiftbox.put("Snickers", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		case 3:
		System.out.println("Enter Kitkat units : ");
		quantity=scanner_object.nextInt();
		object=new Kitkat();
		total_weight += object.calculate_weight(Kitkat_weight,quantity);
		mygiftbox.put("kitkat", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		case 4:
		System.out.println("Enter Laddu units : ");
		quantity=scanner_object.nextInt();
		object=new Laddu();
		total_weight += object.calculate_weight(Laddu_weight,quantity);
		mygiftbox.put("Laddu", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		case 5:
		System.out.println("Enter Cova units : ");
		quantity=scanner_object.nextInt();
		object=new Cova();
		total_weight += object.calculate_weight(Cova_weight,quantity);
		mygiftbox.put("Cova", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		case 6:
		System.out.println("Enter Jilebi units : ");
		quantity=scanner_object.nextInt();
		object=new Jilebi();
		    total_weight += object.calculate_weight(Jilebi_weight,quantity);
		   mygiftbox.put("Jilebi", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		
		default : System.out.println("Enter correct choice ");
		}
		}
		}
		}


