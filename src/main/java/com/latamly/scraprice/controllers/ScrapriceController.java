package com.latamly.scraprice.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.latamly.scraprice.models.ScrapriceModel;
import com.latamly.scraprice.services.ScrapriceService;

@RestController
@RequestMapping("/precio")
public class ScrapriceController {
    
    @Autowired
    ScrapriceService scrapriceService;

    @GetMapping()
    public ArrayList<ScrapriceModel> obtenerPrecio(){
        return scrapriceService.obtenerPrecio();
    }

    @PostMapping()
    public ScrapriceModel guardarPrecio(@RequestBody ScrapriceModel tc){
        return this.scrapriceService.guardarPrecio(tc);
    }
    
}
