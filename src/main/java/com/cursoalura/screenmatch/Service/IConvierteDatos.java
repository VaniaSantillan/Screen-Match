package com.cursoalura.screenmatch.Service;

public interface IConvierteDatos {

    <T> T obtenerDatos(String json, Class <T> clase);

}
