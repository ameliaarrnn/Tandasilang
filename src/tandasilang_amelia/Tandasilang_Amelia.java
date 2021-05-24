package tandasilang_amelia;

public class Tandasilang_Amelia {
    public static void main(String[] args) {
        int panjang = 5;
        int lebar = 5;
        
       for(int i=0; i<lebar; i++){
           for(int x=0; x<panjang; x++){
               if(i==x || (i+x)%lebar==lebar-1){
                   System.out.print("8");
               }else{
                   System.out.print("=");
               }
           }
           System.out.println();
       }
    }
    
}
