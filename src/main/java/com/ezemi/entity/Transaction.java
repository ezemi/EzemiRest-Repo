package com.ezemi.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tbl_Transaction")
public class Transaction {
	@Id
	@GeneratedValue
	UUID transactionId;
	
	@ManyToOne
	User user;
	
	double amount;
	
	LocalDateTime transactionDate;
	
	String transactionMsg;
	

	public String getTransactionMsg() {
		return transactionMsg;
	}

	public void setTransactionMsg(String transactionMsg) {
		this.transactionMsg = transactionMsg;
	}

	public UUID getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(UUID transactionId) {
		this.transactionId = transactionId;
	}
	
	@JsonIgnore
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}




	
	
}
