package com.bitlord.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.bitlord.aopdemo.Account;


@Component
public class AccountDAO {
	
	public void addAccount( Account theAccount ) {
		
		System.out.println( getClass() + ": DOING MY DB  WORK: ADDING AN ACCOUNT" );
		
	}

}
