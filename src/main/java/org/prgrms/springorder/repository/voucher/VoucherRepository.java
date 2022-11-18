package org.prgrms.springorder.repository.voucher;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.prgrms.springorder.domain.voucher.Voucher;

public interface VoucherRepository {

	void save(Voucher voucher);

	Optional<Voucher> findById(UUID uuid);

	List<Voucher> findAll();

	void delete(UUID voucherId);
}
