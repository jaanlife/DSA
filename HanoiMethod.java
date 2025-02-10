
public class HanoiMethod {

    
    public static void towerofHanoi(char src, char des,char aux,int n) {
        if (n == 1) {
            System.out.println("Move to disk From" + src + " to " + des);

        } 
        else{
            towerofHanoi(src,aux,des,n-1);
            towerofHanoi(src,des,aux,1);
            towerofHanoi(aux,des,src,n-1);
        }
    }
    
   public static void main(String args[])
   {
       int noOfDisks = 4;
       towerofHanoi('A','B','C',noOfDisks);
   } 
}
    
