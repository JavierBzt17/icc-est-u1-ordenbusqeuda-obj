package controllers;

import models.Persona;

public class PersonaController {
    public void sortByDireccionCodigo(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            int indice = i;
            for (int j = i + 1; j < personas.length; j++) {
                indice = j;
                indice = j;
                //if (personas[j].getDierccion().getCodigo() > personas[indice].getDierccion().getCodigo()) {
                if (personas[j].equalsByCodigoDirecion(personas[indice])) {
                    indice = j;
                }
            } 
            if (indice != i) {
                Persona temp = personas[indice];
                personas[indice] = personas[i];
                personas[i] = temp;
            }
        }
    }
    public Persona findPersonaByCodigoDireccion (Persona[] personas, int codigo) {
        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {
            int center  = (bajo + alto) / 2;
            int valorCentro = personas[center].getCodigoDierccion();
            //if (personas[center].equalsByCodigoDirecion(codigo)) {
            if (valorCentro == codigo) {
                return personas[center];
            }
            if (valorCentro < codigo) {
                return personas [center];
            }
        }
        return null;
    }
}
