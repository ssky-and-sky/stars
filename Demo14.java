class Demo14{
    public static void main(String[] args) {
        int i=0;
        while(i++<5){
            int j=0;
            while(j++<6-i){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}