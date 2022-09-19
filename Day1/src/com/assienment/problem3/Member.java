package com.assienment.problem3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Member implements Comparable<Member> {
	int memberId ;
	int membershipNumber ;
	String memberName ;
	LocalDate membershipEnd ;
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", membershipNumber=" + membershipNumber + ", memberName=" + memberName
				+ ", membershipEnd=" + membershipEnd + "]";
	}
	public Member(int memberId, int membershipNumber, String memberName, LocalDate membershipEnd) {
		super();
		this.memberId = memberId;
		this.membershipNumber = membershipNumber;
		this.memberName = memberName;
		this.membershipEnd = membershipEnd;
	}
	@Override
	public int compareTo(Member o) {
		if(this.memberId == o.memberId || this.memberName == o.memberName)
				return 0 ;
		else
		{
			int diff = (int) ChronoUnit.DAYS.between( o.membershipEnd , membershipEnd) ;
			return diff ;
		}
	}
	
	
}
