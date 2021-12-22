package it.academy.finalexamen.repository;

import it.academy.finalexamen.entity.InquiryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InquiryRepository extends JpaRepository<InquiryEntity, Long > {
}
