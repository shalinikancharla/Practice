package javaPractice;

public class LoopsDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        int j = 10;
        do {
            System.out.print(j + " ");
            j--;
        } while (j >= 1);
        System.out.println();


        for (int z = 1; z < 10; z++) {
            System.out.print(z+" ");
        }
        System.out.println();

        int a[]=new int[5];
        a[0]=20;a[1]=30;a[2]=60;;a[3]=50;
        for (int p:a) {
            System.out.print(p+" ");
        }

    }
}
