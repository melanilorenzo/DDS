package inscripciones;

import materias.Materia;
import personas.Alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List <Materia> materiasAInscribirse;

    public Inscripcion(Alumno alumno) {

        this.materiasAInscribirse = new ArrayList<>();
        this.alumno = alumno;
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
