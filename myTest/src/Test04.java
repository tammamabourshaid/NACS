package myTest;

public class Test04 {

    public static void main(String[] args) {
        hasEqualSum(10, 20, 10);
    }

    public static void hasEqualSum(int num1, int num2, int num3) {
        if (num1 + num2 == num3) {
            System.out.println("true");
//                    return true;

        } else {
            System.out.println("false");
//                    return false;
        }

    }

}

//        int count = 0;
//        int sum = 0;
//
//        for (int i = 1; i < 1000; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
// count++;
// sum+=i;
//                System.out.println("number  " +  i );
//            }
//            if (count==5){
//                break;
//            }
//        }
//        System.out.println("sum" + sum);
//    }
