package com.cvc.cvc_backend.repository;

import com.cvc.cvc_backend.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
