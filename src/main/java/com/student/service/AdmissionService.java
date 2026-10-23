package com.student.service;

import com.student.model.Admission;
import com.student.repository.AdmissionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdmissionService {
    private final AdmissionRepository repository;

    public AdmissionService(AdmissionRepository repository) {
        this.repository = repository;
    }

    public Admission saveAdmission(Admission admission) {
        return repository.save(admission);
    }

    public List<Admission> getAllAdmissions() {
        return repository.findAll();
    }
}
