package com.ezequiel.concesionaria.persistencia;

import com.ezequiel.concesionaria.logica.Automovil;

public class ControladoraPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }
    
}
