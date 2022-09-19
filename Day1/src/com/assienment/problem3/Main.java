package com.assienment.problem3;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Library library = new Library() ;
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Please enter the no of books:");
		try {
		int n= sc.nextInt() ;	
		int count = 1 ;
		while(n-->0) {
			
			System.out.println("Please enter the details of book no "+count++);
			System.out.println("enter the book Id no");
			int bookId = sc.nextInt() ;
			sc.nextLine() ;
			System.out.println("enter the book name");
			String bookName = sc.nextLine() ;
			System.out.println("enter the book author name");
			String bookAuthor = sc.nextLine() ;
			
			Book book = new Book(bookId, bookName, bookAuthor) ;
			
			library.books.add(book) ;
			}
			
		
		System.out.println("Please enter total member of library");
		int mem = sc.nextInt() ;
		count = 1 ;
		while(mem-->0) {
			
			System.out.println("enter the details of member no " + count++);
			System.out.println("enter the member Id");
			int memberId = sc.nextInt() ;
			sc.nextLine() ;
			System.out.println("enter the name of member");
			String memberName = sc.nextLine() ;
			System.out.println("enter the membership Id");
			int membershipId = sc.nextInt() ;
			sc.nextLine() ;
			System.out.println("enter the expiration date of the member's membership in the formar of dd-MM-yyy");
			String date = sc.next() ;
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy") ;
			LocalDate membershipEnd = LocalDate.parse(date , dtf) ;
			Member member = new Member(memberId, membershipId, memberName, membershipEnd) ;
			library.members.add(member) ;
				
			}
			
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		sc.close(); 
		System.out.println("Books Details \n==================================");
		Iterator<Book> bookIterator = library.books.iterator() ;
		while(bookIterator.hasNext()) {
			Book currentBook = bookIterator.next() ;
			System.out.println(currentBook);
		}
		System.out.println( "\nMembers details \n==================================");
		Iterator<Member> memberIterator = library.members.iterator() ;
		while(memberIterator.hasNext()) {
			Member memb = memberIterator.next() ;
			System.out.println(memb);
		}
		
		
	}
}
