public class pattern18 {
    public static void main(String args[]){
        int n=5;
        for(int i = 0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(char ch1 = 'A'; ch1 <= 'A'+i;ch1++){
                System.out.print(ch1);
            }
            for(char ch1 = (char)('A'+i-1); ch1 >= 'A';ch1--){
                System.out.print(ch1);
            }
            System.out.println();
        }
    }
}
