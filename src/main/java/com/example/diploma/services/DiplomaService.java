package com.example.diploma.services;

import com.example.diploma.dto.AlumnoDTO;
import com.example.diploma.dto.AsignaturaDTO;
import com.example.diploma.dto.DiplomaDTO;

public class DiplomaService {
    public static DiplomaDTO generarDiploma(AlumnoDTO alumno){
        float acum = 0;
        for (AsignaturaDTO asignatura: alumno.getAsignaturas()) {
            acum += asignatura.getNota();
        }

        float promedio = acum/alumno.getAsignaturas().size();
        String mensaje = promedio > 9 ? "Grande Crackkk!!" : "Buen trabajo!!";

        return new DiplomaDTO(mensaje, promedio, alumno.getNombre());
    }
}
