import java.util.Scanner;

 

public class Main {

        public static void main(String[] args) {

               

                

                

                Scanner sc = new Scanner(System.in);

                int N = sc.nextInt();

                float dis[] = new float[N];

                String na[] = new String[N];

                float min = Integer.MAX_VALUE;

               

                

                sc.nextLine();

               

                for (int i = 0; i < N; i++) {

                       

                        String in = sc.nextLine();

                       

                        String data[] = in.split(",");

                        

                        

                        

                        String name = data[0];

                        int price = Integer.parseInt(data[1]);

                        int discount = Integer.parseInt(data[2]);

                       

                        

                        float d = (price * discount) / 100.0f;

                        if (d <= min) {

                                min = d;

                                na[i] = name;

                                dis[i] = d;

                               

                        }

                       

 

                }

                for (int i = 0; i < N; i++) {

                       

                        if (min == dis[i]) {

                                System.out.println(na[i]);

                        }

                }

 

                sc.close();

        }

 

}