package beginner900;

import java.util.Scanner;

public class Forked {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int o=0;o<a;o++){
            int b=sc.nextInt(),c=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt(),w=sc.nextInt(),z=sc.nextInt();
            int ans=0;
            if(b!=c) {
                ans += isValid(x + b, y - c, w, z, b, c);
                ans += isValid(x - b, y + c, w, z, b, c);
                ans += isValid(x - b, y - c, w, z, b, c);
                ans += isValid(x + b, y + c, w, z, b, c);
            }
            ans += isValid(x - c, y + b, w, z, b, c);
            ans += isValid(x + c, y - b, w, z, b, c);
            ans += isValid(x - c, y - b, w, z, b, c);
            ans += isValid(x + c, y + b, w, z, b, c);
            System.out.println(ans);
        }
    }

    public static int isValid(int x, int y, int w, int z, int b, int c){
        if(x+b==w&&y+c==z){
            return 1;
        }
        if(x-b==w&&y+c==z){
            return 1;
        }
        if(x+b==w&&y-c==z){
            return 1;
        }
        if(x-b==w&&y-c==z){
            return 1;
        }
        if(x+c==w&&y+b==z){
            return 1;
        }
        if(x-c==w&&y+b==z){
            return 1;
        }
        if(x+c==w&&y-b==z){
            return 1;
        }
        if(x-c==w&&y-b==z){
            return 1;
        }
        return 0;
    }

}
