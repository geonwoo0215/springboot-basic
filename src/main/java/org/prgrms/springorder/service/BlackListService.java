package org.prgrms.springorder.service;

import java.util.List;
import java.util.stream.Collectors;

import org.prgrms.springorder.domain.customer.Customer;
import org.prgrms.springorder.repository.customer.FileBlackListRepository;
import org.springframework.stereotype.Component;

@Component
public class BlackListService {

	private final FileBlackListRepository fileBlackListRepository;

	public BlackListService(FileBlackListRepository fileBlackListRepository) {
		this.fileBlackListRepository = fileBlackListRepository;
	}

	public List<String> getBlackList() {
		return fileBlackListRepository.findAll().stream().map(Customer::toString).collect(Collectors.toList());
	}

}
