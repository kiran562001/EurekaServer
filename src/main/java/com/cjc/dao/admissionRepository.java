package com.cjc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Admission;

@Repository
public interface admissionRepository extends JpaRepository<Admission, Integer> {

}
