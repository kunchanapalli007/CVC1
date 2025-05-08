package com.cvc.cvc_backend.repository;

import com.cvc.cvc_backend.model.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
}
