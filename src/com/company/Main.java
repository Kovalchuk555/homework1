package com.company;

public class Main {

    public static void main(String[] args) {
        float a = 55;
        float b = 12;
        float c = 36;
        double d=(b*b)-(4*a*c);
        float e=0;
        float f=0;
        if(d==0){
            e=-1*(b/(2*a));
            System.out.println("Уравнеие имеет 1 квадратный корень, который равен "+e);
        }
        else {
            if(d>0){
                e=((-1*b)+(float)Math.sqrt(d))/(2*a);
                f=((-1*b)-(float)Math.sqrt(d))/(2*a);
                System.out.println("Уравнение имеет 2 квадратных корня: "+e+" и "+f);
            }
            else {
                System.out.println("Уравнение не имеет квадратных корней");
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int s= a*b;
        int p= 2*(a+b);

        System.out.println("Площадь равна  "+s);
        System.out.println(" Периметр равен  "+p);
    }

}
public class Main {

    public static void main(String[] args) {
        int p = 64;
        double a= Math.sqrt(p) ;
        ;

        System.out.println("сторона равна  "+a);

    }

}

public class Main {

    public static void main(String[] args) {
        double a=44.67;
        double b=77.555;
        double c=894.56;
        double ans =((b+  Math.sqrt(b*b+4*a*c)/2*a-(a*a*a*c)+1/b*b));

        System.out.println("ans ="+ans);
    }
}



public class Main {

    public static void main(String[] args) {
        double x=44;
        double y=56.333;

        double ans = (x + y) / y + 1 - (x * y - 12) / (34 + x);

        System.out.println("ans = " + ans);

    }
}


public class Main {

    public static void main(String[] args) {
        double x=44.55;
        double ans =x-x*x*x/3+x*x*x*x*x/5;



        System.out.println("ans = " + ans);

    }
}




public class Main {

    public static void main(String[] args) {
        double x=44.55;
        double ans =Math.sin(Math.sqrt(x+1))-Math.sin(Math.sqrt(x-1));


        System.out.println("ans = " + ans);

    }
}



