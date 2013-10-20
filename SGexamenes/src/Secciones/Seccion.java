/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Secciones;

import Preguntas.Preguntas;

/**
 *
 * @author fr0609
 */
public interface Seccion { 
  public void insertarInfo();
  public void eliminarInfo();
  public void agregarPregunta(Preguntas p); 	
  public void eliminarPregunta(Preguntas p); 				
} 


