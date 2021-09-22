class testThread extends Thread {
    public void run() {
        System.out.println("thread is running...");
    }
 
    public static void main(String args[]) {
        testThread t1 = new testThread();
        t1.start();
    }
}