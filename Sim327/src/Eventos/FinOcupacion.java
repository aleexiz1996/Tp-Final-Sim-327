/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;

import Clases.Estacionamiento;

/**
 *
 * @author aleex
 */
public class FinOcupacion extends Evento{
    
    private Estacionamiento est;
    
    public FinOcupacion(Estacionamiento est) {
        this.est = est;
    }

    public Estacionamiento getEst() {
        return est;
    }

    public void setEst(Estacionamiento est) {
        this.est = est;
    }
    
    public String getEvento(){
      return "FTO";
    }

}
