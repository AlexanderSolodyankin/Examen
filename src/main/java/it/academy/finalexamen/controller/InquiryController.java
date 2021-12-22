package it.academy.finalexamen.controller;

import it.academy.finalexamen.entity.InquiryEntity;
import it.academy.finalexamen.repository.InquiryRepository;
import it.academy.finalexamen.service.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class InquiryController {
    @Autowired
    private InquiryService service;

    @PostMapping("/counter")
    public String inquiryPost() {
        InquiryEntity inquiryEntity = new InquiryEntity();
        inquiryEntity.setName("Post запрос");
        service.save(inquiryEntity);
        return null;
    }

    @GetMapping("/counter")
    public Integer counter() {
        InquiryEntity inquiryEntity = new InquiryEntity();
        inquiryEntity.setName("Get запрос");
        service.save(inquiryEntity);
        return service.getCounter();
    }

    @GetMapping("/report")
    public List<InquiryEntity> getEntity(){
        InquiryEntity inquiryEntity = new InquiryEntity();
        inquiryEntity.setName("Get запрос");
        service.save(inquiryEntity);
        return service.getReport();
    }
}
