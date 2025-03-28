package org.prgrms.springorder.controller;

import java.util.List;

import org.prgrms.springorder.domain.voucher.VoucherType;
import org.prgrms.springorder.service.VoucherService;
import org.springframework.stereotype.Component;

@Component
public class VoucherController {

	private final VoucherService voucherService;

	public VoucherController(VoucherService voucherService) {
		this.voucherService = voucherService;
	}

	public void createVoucher(VoucherType voucherType, double value) {
		voucherService.createVoucher(voucherType,value);
	}

	public List<String> getVoucherList() {
		return voucherService.getList();
	}




}
