package Week4.Day2;

public class TowerofHanoi 
{
    public static void TOH(int N,char src_rod,char aux_rod,char dest_rod)
    {
        if(N==1)
        {
            System.out.println("Move Disk from "+src_rod+" to "+dest_rod);
            return;
        }
        TOH(N-1, src_rod, dest_rod,aux_rod);
        System.out.println("Move Disk from "+src_rod+" to "+dest_rod);
        TOH(N-1, aux_rod, src_rod,dest_rod);
    }
    public static void main(String[] args) 
    {
        int N=5;
        TOH(N,'A','B','C');
    }
}
