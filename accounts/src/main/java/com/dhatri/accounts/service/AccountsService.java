package com.dhatri.accounts.service;

import com.dhatri.accounts.dto.CustomerDto;

public interface AccountsService {
    /*
    *
    * @Param customerDto - CustomerDto Object
    *
    */
    void createAccount(CustomerDto customerDto);
    CustomerDto getCustomerDetails(String mobileNumeber);
    boolean updateAccount(CustomerDto customerDto);
    boolean deleteAccount(String mobileNumber);

}
