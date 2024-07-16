package com.rs.cms.Service;


import java.util.List;


import com.rs.cms.DTO.CustomerDTO;
import com.rs.cms.DTO.CustomerSaveDTO;
import com.rs.cms.DTO.CustomerUpdateDTO;

public interface CustomerService {

	String addCustomer(CustomerSaveDTO customerSaveDTO);

	List<CustomerDTO> getAllCustomer();

	String updateCustomer(CustomerUpdateDTO customerUpdateDTO);

	boolean deleteCustomer(int id);

}
