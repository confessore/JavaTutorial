//Filename PhoneBook.java
//Written by krycess with considerable amount of help
//Written on 11/7/2012

import java.util.Scanner;

public class PhoneBook {
int x;
final int Contacts = 5;
String[] Num = new String[5];
String[] Nam = new String[5];
String nameSearch;
boolean nameWasFound = true;
String endString = "zzz";
Scanner scan = new Scanner(System.in);

public static void main(String args[]) 
{
PhoneBook show = new PhoneBook();
show.getInfo();
}
public void getInfo() 
{
for (x = 0; x < Contacts; ++x) 
{
System.out.print("Name of contact " + (x+1) + ": " );
Nam[x] = scan.next();
if (nameWasFound) 
{
System.out.print("Number of contact " + (x+1) + ": ");
Num[x] = scan.next();
}
}
System.out.println("\n--List--");
for (int i = 0; i < Nam.length; i++) 
{
System.out.println("Name: " + Nam[i] + " Number: " + Num[i]);
}
while(true)
{
System.out.print("\n\nSearch for... : ");
nameSearch = scan.next();
if(nameSearch.equals(endString))
{
break;
}
for (int i = 0; i < Nam.length; i++)
{
if (Nam[i].indexOf(nameSearch) >= 0) 
{
System.out.println("Match found for " + nameSearch + " " + Nam[i] + " " + Num[i]);
}
}
}
}
}