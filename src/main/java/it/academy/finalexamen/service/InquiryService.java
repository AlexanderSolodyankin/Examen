package it.academy.finalexamen.service;

import it.academy.finalexamen.entity.InquiryEntity;

import java.util.List;

public interface InquiryService {
    String save(InquiryEntity inquiryEntity);
    Integer getCounter();
    List<InquiryEntity> getReport();
}
