package personas;

import materias.Materia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private Integer legajo;
    private List<Materia> materiasCursadas;

    public Alumno(String nombre, Integer legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasCursadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getMateriasCursadas() {
        return materiasCursadas;
    }

    public void agregarMateriaCursada(Materia ... materias) {
        Collections.addAll(this.materiasCursadas, materias);
    }
}
