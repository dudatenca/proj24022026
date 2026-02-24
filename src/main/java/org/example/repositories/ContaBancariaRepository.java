package org.example.repositories;

import org.example.models.ContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class ContaBancariaRepository {

    public ContaBancaria save (ContaBancaria contaBancaria){
        return new ContaBancaria();
    }
    public List<ContaBancaria> findAll(){
        return new ArrayList<>();
    }
}
