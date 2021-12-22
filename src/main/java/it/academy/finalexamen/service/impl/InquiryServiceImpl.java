package it.academy.finalexamen.service.impl;

import it.academy.finalexamen.entity.InquiryEntity;
import it.academy.finalexamen.repository.InquiryRepository;
import it.academy.finalexamen.service.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InquiryServiceImpl implements InquiryService {
    @Autowired
    private InquiryRepository inquiryRepository;
    @Override
    public String save(InquiryEntity inquiryEntity) {
        inquiryRepository.save(inquiryEntity);
        return null;
    }

    @Override
    public Integer getCounter() {
        return inquiryRepository.findAll().size();
    }

    @Override
    public List<InquiryEntity> getReport() {
        return inquiryRepository.findAll();
    }
}
