package materias;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }
    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCorrelativas(Materia ... correlativas) {
        Collections.addAll(this.correlativas, correlativas);
    }
}
