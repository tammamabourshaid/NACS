package myTest;

public class Test02 {
//    public static void main(String[] args) {
//        int x = 0;
//        int y = 0;
//        while (x < 6) {
//            y = y + 2;
//            if( y > 4 ) {
//                y = y - 1;
//            }
//
//            System.out.print(x + "" + y + " ");
//            x = x+1 ;
//        }
//    }

//    public static void main(String[] args) {
//        int x = 0;
//        int y = 0;
//        while (x < 10) {
//            x = x + 1;
//            y = y + x;
//
//            System.out.println(x + "  "+y);
//            x = x +2;
//        }
//    }
//}

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 10) {
            if (y < 5) {
                x = x + 1;
                if (y < 3) {
                    x = x - 1;
                }
            }
            y = y + 2;
            System.out.println(x + "  " + y);
            x = x + 1;
        }
    }
}