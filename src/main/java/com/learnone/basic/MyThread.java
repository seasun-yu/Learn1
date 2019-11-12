package com.learnone.basic;

public class MyThread  extends Thread{

    public void run(){
        int k=1,sum=1;
        for(;k<9;k++){
            sum=sum*k;
        }
        System.out.println("1:"+sum);
    }

    public static void main(String args[]){
        MyThread myThread =new MyThread();
        myThread.start();

        Thread thread2 = new Thread(new RunnableMY());
        thread2.start();
    }

}

class  RunnableMY implements Runnable {
    public void run (){
        int k=1,sum=1;
        for(;k<9;k++){
            sum=sum*k;
        }
        System.out.println("2:"+sum);
    }


}