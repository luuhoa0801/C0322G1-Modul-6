package com.example.farm.controller;

import com.example.farm.service.IExportPorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestExportPorkController {
    @Autowired
    private IExportPorkService iExportPorkService;

}
