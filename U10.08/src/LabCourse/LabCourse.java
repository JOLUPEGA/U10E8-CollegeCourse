/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabCourse;

import CollegeCourse.CollegeCourse;
import CollegeCourse.DepaEnum;

/**
 *
 * @author Jose Luis Perez
 */
public class LabCourse extends CollegeCourse{
    
    private boolean lab;
    
    public LabCourse(DepaEnum departamento, int numCurso, int creditos){
        super(departamento, numCurso, creditos);
        this.lab = departamento.isNumero();
        if(departamento.isNumero()){
            setTarifaCurso(50+120);        
        }
    }
    
    public String display(){
        if(this.lab){
            return  "ES UN CURSO DE LABORATORIO " + super.display();
        }
        return super.display();
    }  
}