package com.company;

public class TaskBThread extends Thread{
    private String write;

    public TaskBThread(String write) {
        this.write = write;
    }

    public String getWrite() {
        return write;
    }

    public void setWrite(String write) {
        this.write = write;
    }

    @Override
    public void run() {
        System.out.println(this.write);
    }
}
