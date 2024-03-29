package dev.Dayo.Paystack.PaystackPaymentRepository.Impl;

import dev.Dayo.Paystack.Model.Domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepositoryImpl extends JpaRepository<AppUser, Long> {
}
