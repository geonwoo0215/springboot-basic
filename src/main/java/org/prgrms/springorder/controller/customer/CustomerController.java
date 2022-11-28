package org.prgrms.springorder.controller.customer;

import java.util.List;

import org.prgrms.springorder.controller.dto.CustomerRequestDto;
import org.prgrms.springorder.domain.customer.Customer;
import org.prgrms.springorder.service.customer.BlackListService;
import org.prgrms.springorder.service.customer.CustomerService;
import org.springframework.stereotype.Component;

@Component
public class CustomerController {

	private final CustomerService customerService;
	private final BlackListService blackListService;

	public CustomerController(CustomerService customerService,
		BlackListService blackListService) {
		this.customerService = customerService;
		this.blackListService = blackListService;
	}

	public List<String> getBlackList() {
		return blackListService.getBlackList();
	}

	public List<String> getCustomerList() {
		return customerService.getCustomerList();
	}

	public void createCustomer(CustomerRequestDto customerRequestDto) {
		customerService.createCustomer(customerRequestDto);
	}




}
