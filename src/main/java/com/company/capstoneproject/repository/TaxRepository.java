package com.company.capstoneproject.repository;

import com.company.capstoneproject.model.Tax;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxRepository extends JpaRepository<Tax,String> {
}
