package com.zyh.jb.test1;

/**
 * @ClassName PC
 * @Description TODO
 * @Author 87739
 * @Date 2020/10/17
 **/
public class PC {
    CPU cpu;
    HardDisk hardDisk;

    void setCpu(CPU cpu){
        this.cpu = cpu;
    }
    void setHardDisk(HardDisk disk){
        this.hardDisk = disk;
    }
    void show(){
        System.out.println("cpu速度:" + cpu.getSpeed());
        System.out.println("硬盘速度："+ hardDisk.getAmount());
    }
}
