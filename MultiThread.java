class MultiThread extends Thread{

  public void run(){

    try{
      System.out.println("Thread " + Thread.currentThread().getId()+ " is running\n");
      ChocolateBoiler choco = ChocolateBoiler.getInstance();

    }
    catch(Exception e){
      System.out.println("Exception is caught");
    }
  }
}
