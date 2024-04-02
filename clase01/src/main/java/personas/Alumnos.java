package personas;

import materias.Materia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumnos {
    private String nombre;
    private List<Materia> materiasCursadas;

    public Alumnos(String nombre) {
        this.nombre = nombre;
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
