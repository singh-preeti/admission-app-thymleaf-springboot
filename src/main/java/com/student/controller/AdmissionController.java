package com.student.controller;

import com.student.model.Admission;
import com.student.service.AdmissionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdmissionController {
    private final AdmissionService service;

    public AdmissionController(AdmissionService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("admission", new Admission());
        model.addAttribute("admissions", service.getAllAdmissions());
        return "admission-form";
    }

    @PostMapping("/admissions")
    public String submitForm(Admission admission) {
        service.saveAdmission(admission);
        return "redirect:/?success";
    }
}
