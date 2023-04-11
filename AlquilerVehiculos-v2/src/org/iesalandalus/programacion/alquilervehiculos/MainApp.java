package org.iesalandalus.programacion.alquilervehiculos;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.controlador.Controlador;
import org.iesalandalus.programacion.alquilervehiculos.modelo.FactoriaFuenteDatos;
import org.iesalandalus.programacion.alquilervehiculos.modelo.Modelo;
import org.iesalandalus.programacion.alquilervehiculos.modelo.ModeloCascada;
import org.iesalandalus.programacion.alquilervehiculos.vista.texto.Vista;
import org.iesalandalus.programacion.alquilervehiculos.vista.texto.VistaTexto;

public class MainApp {

	public static void main(String[] args) {
		// Ánimo!!!!
		
		Modelo modelo = new ModeloCascada(FactoriaFuenteDatos.FICHEROS);
		Vista vista = new VistaTexto();
		Controlador controlador = new Controlador(modelo, vista);
		
		try {
			controlador.comenzar();
		} catch (OperationNotSupportedException e) {
			System.out.println("ERROR: Se ha producido un error a la hora de leer los ficheros, revisar que todo este en su sitio.");
		}
	}
}
