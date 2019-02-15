package myTest;

//public class Test03 {
//        boolean canRecord = false;
//        void playTape() {
//            System.out.println("tape playing");
//        }
//        void recordTape() {
//            System.out.println("tape recording");
//        }
//    }
//    class TapeDeckTestDrive {
//        public static void main(String [] args) {
//            Test03 t = new Test03();
//            t.canRecord = true;
//            t.playTape();
//            if (t.canRecord == true) {
//                t.recordTape();
//            }
//        }
//    }

public class Test03 {

    boolean canRecord = false;

    void recordDVD() {
        System.out.println("DVD recording");
    }

    static class DVDPlayerTestDrive {
        public static void main(String[] args) {
            Test03 d = new Test03();
            
            d.canRecord = true;
//            d.playDVD();
            if (d.canRecord == true) {
                d.recordDVD();
            }
        }
    }
}