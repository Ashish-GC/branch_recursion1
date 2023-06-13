public class MazePath1{

    static void mazepath(int row,int col,int endrow,int endcol,String result){

        if(row==endrow && col==endcol){
            System.out.println(result);
            return ;
        }
        if(row>endrow||col>endcol){
            return;
        }
             
        mazepath(row+1,col,endrow,endcol,result+"D");
        mazepath(row,col+1,endrow,endcol,result+"R");

    }
    public static void main(String[] args) {
        mazepath(0,0,2,2,"");
    }
}