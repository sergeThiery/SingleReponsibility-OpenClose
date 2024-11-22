package org.example;

public class Service {

    public void iterate(){
        boolean running = true;
        while(running){
            for(int i = 0; i < 100; i++){
                System.out.println(i);
                if(i== 80){
                    System.out.println("Stop");
                    running = false;
                    break;
                }
            }
        }
    }
}
