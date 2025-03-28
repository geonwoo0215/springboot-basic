package org.prgrms.springorder.domain.voucher;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Voucher {

	private final UUID voucherId;
	private final double value;
	private final LocalDateTime createdAt;
	private final VoucherType voucherType;

	public abstract int discount(double beforeDiscount);

	public abstract void validateValue(double value);

	public Voucher(UUID voucherId, double value, LocalDateTime createdAt,
		VoucherType voucherType) {
		validateValue(value);
		this.voucherId = voucherId;
		this.value = value;
		this.createdAt = createdAt;
		this.voucherType = voucherType;
	}

	public UUID getVoucherId() {
		return voucherId;
	}

	public double getValue() {
		return value;
	}

	public VoucherType getVoucherType() {
		return voucherType;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
}
