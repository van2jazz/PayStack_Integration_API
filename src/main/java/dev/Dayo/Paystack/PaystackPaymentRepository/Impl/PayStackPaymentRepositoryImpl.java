package dev.Dayo.Paystack.PaystackPaymentRepository.Impl;

import dev.Dayo.Paystack.Model.Domain.PaymentPaystack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PayStackPaymentRepositoryImpl extends JpaRepository<PaymentPaystack,Long > {
}
