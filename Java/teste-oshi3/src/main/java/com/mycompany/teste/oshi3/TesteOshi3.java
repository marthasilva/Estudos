/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teste.oshi3;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

/**
 *
 * @author Samsung
 */
public class TesteOshi3 {
    public static void main(String[] args) {
        SystemInfo si = new SystemInfo();
        
        si.getHardware();
        HardwareAbstractionLayer hal = si.getHardware();
        CentralProcessor cpu = hal.getProcessor();
        System.out.println(Long.toString(si.getHardware().getMemory().getTotal()));
        System.out.println(si.getHardware().getProcessor().getModel());
        System.out.println(si.getHardware().getComputerSystem().getModel());
        System.out.println(si.getHardware().getProcessor().getName());
        System.out.println(si.getOperatingSystem().getFileSystem());
    }
}
