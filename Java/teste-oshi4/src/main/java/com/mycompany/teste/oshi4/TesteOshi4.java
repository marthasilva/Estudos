/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teste.oshi4;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

/**
 *
 * @author Samsung
 */
public class TesteOshi4 {
    public static void main(String[] args) {
        
       
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();
        CentralProcessor cpu = hal.getProcessor();
        Double memoria = si.getHardware().getMemory().getTotal() / Math.pow(10,9);
        
        System.out.println(String.format("memoria: %.1f ", memoria));
        System.out.println("Processador");
        System.out.println(si.getHardware().getProcessor().getName());
       
        
    }
}
