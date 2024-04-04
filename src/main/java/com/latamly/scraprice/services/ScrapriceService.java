package com.latamly.scraprice.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latamly.scraprice.models.ScrapriceModel;
import com.latamly.scraprice.repositories.ScrapriceRepository;

@Service
public class ScrapriceService {
    @Autowired
    ScrapriceRepository scrapyRepository;

    public ArrayList<ScrapriceModel> obtenerPrecio() {
        return (ArrayList<ScrapriceModel>) scrapyRepository.findAll();
    }

    public ScrapriceModel guardarPrecio(ScrapriceModel usuario) {
        return scrapyRepository.save(usuario);
    }

    /* public Optional<ScrapriceModel> obtenerPorId(int id) {
        return scrapyRepository.findById(id);
    } */

    /* public ArrayList<ScrapriceModel> obtenerPorPrioridad(Integer prioridad) {
        return scrapyRepository.findByPrioridad(prioridad);
    } */

    /* public boolean eliminarUsuario(int id) {
        try {
            scrapyRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    } */
}