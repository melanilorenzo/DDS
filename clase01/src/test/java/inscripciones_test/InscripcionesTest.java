package inscripciones_test;

import inscripciones.Inscripcion;
import materias.Materia;
import org.junit.Assert;
import org.junit.Test;
import personas.Alumno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InscripcionesTest {


    @Test
    public void alumnoSePuedeInscribirAParadigmas() {

        List<Materia> correlativasAyED = new ArrayList<>();
        Materia ayed = new Materia("AyED", correlativasAyED);
        ayed.agregarCorrelativas();

        List<Materia> correlativasPdP = Arrays.asList(ayed);
        Materia pdp = new Materia("PdP", correlativasPdP);
        pdp.agregarCorrelativas(ayed);

        Alumno alumna = new Alumno("Julia", 123);
        alumna.agregarMateriaCursada(ayed);

        Inscripcion inscripcion = new Inscripcion(alumna);
        inscripcion.agregarMateriasAInscribirse(pdp);
        inscripcion.aprobada();

        Assert.assertEquals(true,inscripcion.aprobada());
    }

    @Test
    public void NoCumpleConLasCorrelativas(){

        List<Materia> correlativasAyED = new ArrayList<>();
        Materia ayed = new Materia("AyED", correlativasAyED);
        ayed.agregarCorrelativas();

        List<Materia> correlativasPdP = Arrays.asList(ayed);
        Materia pdp = new Materia("PdP", correlativasPdP);
        pdp.agregarCorrelativas(ayed);

        List<Materia> correlativasDdS = Arrays.asList(ayed, pdp);
        Materia dds = new Materia("DdS", correlativasDdS);
        dds.agregarCorrelativas(ayed, pdp);

        Alumno alumno = new Alumno("Pablo", 254);
        alumno.agregarMateriaCursada(ayed);

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMateriasAInscribirse(dds);
        inscripcion.aprobada();

        Assert.assertEquals(false,inscripcion.aprobada());
    }

}
