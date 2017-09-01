/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioJava;

import java.util.Date;

/**
 *
 * @author alunoadm
 */
public class Dados {
    public String nome, departamento, rg;
    public double salario;
    public Date dataEntrada;
    
    public void aumentoSalario (double aumento){
        this.salario = this.salario + aumento;
       
    }
    
    public void faturamentoAnual (double aumento){
}
