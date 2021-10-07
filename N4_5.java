public class N4_5
    {
        //4.5
        public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1" );
        }
        System.out.println("2");
    }
    }

