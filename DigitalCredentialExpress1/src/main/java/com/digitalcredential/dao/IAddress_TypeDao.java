package com.digitalcredential.dao;


import java.util.List;

import com.digitalcredential.entity.Address_Type;

public interface IAddress_TypeDao {
	List<Address_Type> getAllAddress_Type();
	Address_Type getAddress_Type(int Address_Type);
    boolean Address_TypeExists(String Address_Type_Desc);
	
}
