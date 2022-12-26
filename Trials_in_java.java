import java.util.*;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        String sn = String.valueOf(n);
        
        for (int i = 0; i < sn.length(); i = i + 2)
        {
            s = s + Integer.valueOf(sn.charAt(i));
        }
        for (int i = 1; i < sn.length(); i = i + 2)
        {
            s = s - Integer.valueOf(sn.charAt(i));
        }
       
        System.out.println(Math.abs(s));
        sc.close();
    }
}



// n = input("")
// s = 0
// l = len(str(n))

// for i in range(0 , l, 2 ):
//     s += int(n[i])
// for j in range(l - 1 ,0 ,-2 ):
//     s -= int(n[j])
// print(s)
// import  java.io.*;
// import java.util.*;

// class Main
// {
//         public static void main(String[] args) 
//         {
//             Scanner sc = new Scanner(System.in);
//             String S = sc.nextLine();
//             char ch = '';
//             String w = "";
            
//         }

        
//         public static String Iterate(Striing str)
//         {
//             for( int i = 0; i < str.length() - 1; i++)
//             {
//                 if (str[i] == str[i + 1])
//                 {
//                     int til = Lining(str,i);
//                 }
                
//             }
//         }
        
//         public static int Lining(String str,int j)
//         {
//             if (str[j] == str[j + 1])
//             {
//                 int no = Lining(str,j+1);
//             }
//             return j;
//         }
// }
