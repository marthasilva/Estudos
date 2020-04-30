/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teste.oshi2;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

/**
 *
 * @author Samsung
 */
public class TesteOshi {
    
    public static void main(String[] args) {
        
      SystemInfo si = new SystemInfo();  
      
        HardwareAbstractionLayer hal = si.getHardware();
        
        CentralProcessor cpu = hal.getProcessor();
        System.out.println(hal.getMemory());
        
        System.out.println(si.getOperatingSystem());
        
        System.out.println(hal.getComputerSystem());
        
        System.out.println(hal.getDiskStores());
    }
}
