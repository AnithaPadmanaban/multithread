
class Example extends Thread{
       public void run()
       {
           for(int i=1;i<=10;i++)
           {
               System.out.println(i);
               try {
                sleep(200);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
           }
       }
    }
    class Test extends Thread{
       public void run()
       {
             for(int i=65;i<=75;i++)
           {
               System.out.println((char)i);
               try {
                    sleep(200);
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                }
           }
       }
    }
    public class Main
    {
        public static void main(String[] args) {
        Example example = new Example();
        Test test = new Test();
        test.start();
        example.start();
        
        }
    }

