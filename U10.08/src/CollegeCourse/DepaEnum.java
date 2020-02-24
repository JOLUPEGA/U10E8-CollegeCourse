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
public enum DepaEnum {
    BIO(true),
    CHM(true),
    CIS(true),
    PHY(true),
    ING(false),
    ENG(false),
    HIS(false),
    MAT(false);
    
    private boolean numero;
    
    private DepaEnum(boolean numero){
        this.numero = numero;
    }
    
    public boolean isNumero(){
        return this.numero;
    }
}