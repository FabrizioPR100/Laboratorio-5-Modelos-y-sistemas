/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Informatica7
 */
public abstract class Empleado {
    private String nombre;
    private int dni;

    public Empleado() {}
    
    public abstract void calcularSalario(int horasExtra);
}
