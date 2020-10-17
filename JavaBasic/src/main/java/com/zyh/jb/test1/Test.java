package com.zyh.jb.test1;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 87739
 * @Date 2020/10/17
 **/
public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.setSpeed(2200);
        HardDisk disk = new HardDisk();
        disk.setAmount(200);
        PC pc = new PC();
        pc.setCpu(cpu);
        pc.setHardDisk(disk);
        pc.show();
    }
}
