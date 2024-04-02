package inscripciones;

import materias.Materia;
import personas.Alumnos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumnos alumno;
    private List <Materia> materiasAInscribirse;

    public Inscripcion() {
        materiasAInscribirse = new ArrayList<>();
    }
    public void agregarMateriasAInscribirse(Materia ... materias) {
        Collections.addAll(this.materiasAInscribirse, materias);
    }

    public boolean aprobada() {
        return materiasAInscribirse.stream().allMatch(materia ->
                materia.getCorrelativas().isEmpty() ||
                        materia.getCorrelativas().stream().allMatch(alumno.getMateriasCursadas()::contains)
        );
    }

}
