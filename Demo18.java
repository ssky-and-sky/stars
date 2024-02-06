class Demo18 {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 9) {
            int j=0;
            while(i<6 ?  j++<6-i:j++<i-4 ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
