package com.example.ssmspringboot2.dao.Service;

import com.example.ssmspringboot2.domain.PokemonForm.PokemonFormDetail;

public interface PokemonFormService {
    PokemonFormDetail findPokemonFormByID(int id);
}
