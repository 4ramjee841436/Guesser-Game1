package practice_program.java;

public class Multi_YieldMethod   implements Runnable{

        public void run()
        {
            for(int i=1;i<=5;i++)
            {
                String threadName=Thread.currentThread().getName();
                System.out.println(threadName + "  i" + "=" + i);
                if("T1".equals(threadName));
                {
                    Thread.yield();
                }

            }
        }
        public static void main(String[] args) {
            Multi_YieldMethod M=new Multi_YieldMethod();
            Thread T=new Thread();
            Thread T1= new Thread();
            Thread t2=new Thread();
            T1.start();
            t2.start();

        }

    }


