package com.ivoyant.week1.labeeled_break;

public class LabelledBreak {
    public static void main(String[] args) {
        label_name:
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==3)break label_name;
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
