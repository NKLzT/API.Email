package com.stellantis.elk.monitor.controller;

import com.stellantis.elk.monitor.model.Email;
import com.stellantis.elk.monitor.service.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.mail.MessagingException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;

@RestController
@AllArgsConstructor
@RequestMapping("api/email")
public class EmailController {
    private EmailService emailService;

    @PostMapping
    public void enviarEmail(@RequestBody Email email) throws MessagingException {
        emailService.enviarEmail(email);
    }

}
