package es.iessoterohernandez.daw.endes.Persona;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


public class PersonaTest 
{
    private  Persona persona;
    
    @BeforeEach
    public void datosPersona() {
        persona = new Persona("Juan", 25, 'H', 70.0, 1.75);
    }
    

    @Test
    public void testCalcularIMC() {
        assertEquals(Persona.INFRAPESO, persona.calcularIMC());
    }

    @Test
    public void testEsMayorDeEdad() {
        assertFalse(persona.esMayorDeEdad());
    }

    @Test
    public void testToString() {
        assertTrue(persona.toString().contains("Nombre: John"));
    }

}
