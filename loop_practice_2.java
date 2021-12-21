import javax.swing.*;

public class loop_practice_2 {
    public static void main(String[] args) {
        int i,n;
          for (i = 2;i <= 100;i++) {
              for (n = 2; n < i; n++){
                if (i % n == 0)
                 break;
              }
              if (n == i)
              System.out.println(i);
          }
    }
}
