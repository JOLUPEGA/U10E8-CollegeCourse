/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollegeCourse;

/**
 *
 * @author Jose Luis Perez
 */
public class CollegeCourse {

    private DepaEnum departamento;
    private int numCurso;
    private int creditos;
    private int tarifaCurso;
    
    public CollegeCourse(DepaEnum departamento, int numCurso, int creditos){
        this.departamento = departamento;
        this.numCurso = numCurso;
        this.creditos = creditos;
        setTarifaCurso(120);
    }
    
    protected void setTarifaCurso(int dinero){
        this.tarifaCurso += (dinero * creditos);
    }
    
    public String display(){
        return "departamento: " + this.departamento + " numero de cursos: " + this.numCurso + " creditos: " + this.creditos + " tarifa del curso: " + this.tarifaCurso;
    }
}