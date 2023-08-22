package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.consola.ConsolaOlimpicos;
import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;
//Motificacion

public class Modificacion {
	private CalculadoraEstadisticas calculadora;

	public static void main(String[] args)
	{
		System.out.println("Hola, mundo!");
		try {
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		System.out.println(calc.paisConMasMedallistas());
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo indicado no se encontró.");
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
