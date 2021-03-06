package com.ezemi.repository;

import java.util.List;

import com.ezemi.entity.Bank;
import com.ezemi.entity.CardType;
import com.ezemi.entity.Category;
import com.ezemi.entity.ContactUs;
import com.ezemi.entity.User;

public interface AdminRepository {
	

	public void addOrUpdateBank(Bank bank);
	
	public Bank getBankById(int bankId);
	
	public List<User> getUsersByBankId(int bankId);
	
	
	public void addOrUpdatecategory(Category ct);
	
	
	public void addOrUpdateCardType(CardType ct);
	
	
	public CardType getCardTypeById(int ctId);
	
	public Category getCategoryById(int categoryId);
	
	
	public void changeCardofUser(String emiCardNo, int cardTypeId);

	void autoDebit();
	
	
	
	public List<CardType> getAllCardTypes();
	
	public void deleteACategory(int categoryId);
	
	
	public void updateCategoryDetails(Category category);
	
	void addCustomerQuery(ContactUs query);
	
	public List<ContactUs> getAllQueries();
	
	public ContactUs getQueryById(int queryId);
	
}
