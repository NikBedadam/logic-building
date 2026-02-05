public class pattern17 {
    public static void main(String args[]){
        for(char ch = 'A'; ch <= 'F'; ch++){
            for(int i = 0;i<= ch - 'A';i++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
