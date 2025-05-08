package com.cvc.cvc_backend.controller;

import com.cvc.cvc_backend.model.ContactMessage;
import com.cvc.cvc_backend.repository.ContactMessageRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    private final ContactMessageRepository contactRepo;

    public ContactController(ContactMessageRepository contactRepo) {
        this.contactRepo = contactRepo;
    }

    @PostMapping("/send")
    public ContactMessage receiveContact(@RequestBody ContactMessage message) {
        return contactRepo.save(message);
    }
}
