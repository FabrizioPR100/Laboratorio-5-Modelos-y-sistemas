/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Informatica7
 */
public class Ingeniero extends Empleado{
    private int sueldoBasico = 3000;
    private int horasTrabajadas = 200;
    private int plusProduccion = sueldoBasico/10;

        
    @Override
    public void calcularSalario(int par) {
        int sueldo = sueldoBasico + plusProduccion;
        System.out.println(sueldo);
    }
    
}
