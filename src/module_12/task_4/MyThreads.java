package module_12.task_4;

class MyThreads {
    public static void main(String[] args) {
        MyThreads.t1.start();
        MyThreads.t2.start();
    }

    public final static Object den = new Object();
    public final static Object ada = new Object();

    public static int n;
    public static int m;

    public static Thread t1 = new Thread() {
        public void run() {
            synchronized (den) {
                for(int i = 0; i < 5; i++, n++)
                    System.out.println("Thread1 n = " + n);
                Thread.yield();
                try {
                    den.wait(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (ada) {
                    for(int i = 0; i < 5; i++, m++)
                        System.out.println("Thread1 m = " + m);
                    System.out.println( "Thread1 success!");
                }
            }
        }
    };

    public static Thread t2 = new Thread() {
        public void run() {
            synchronized (ada) {
                for(int i = 0; i < 5; i++, m++)
                    System.out.println("Thread2 m = " + m);
                synchronized (den) {
                    for(int i = 0; i < 5; i++, n++){
                        System.out.println("Thread2 n = " + n);
                    }
                    System.out.println("Thread2 success!");
                    den.notify();
                }
            }
        }
    };
}