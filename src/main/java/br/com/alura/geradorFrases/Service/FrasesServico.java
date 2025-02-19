package br.com.alura.geradorFrases.Service;

import br.com.alura.geradorFrases.Model.dto.FraseDto;
import br.com.alura.geradorFrases.Repository.FrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrasesServico {

    @Autowired
    private FrasesRepository repository;

    public FraseDto buscarFraseAleatoria() {
        return new FraseDto(repository.buscarFraseAleatoria());
    }
}
