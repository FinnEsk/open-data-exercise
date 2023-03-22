package edu.nyu.cs;


public class temp{
    
    public static void main(String[] args) {
        String text = "the_geom,Borough,Loc,OBJECTID,Street_Nam,From_Stree,To_Street,Index,May07_AM,May07_PM,May07_MD,Sept07_AM,Sept07_PM,Sept07_MD,May08_AM,May08_PM,May08_MD,Sept08_AM,Sept08_PM,Sept08_MD,May09_AM,May09_PM,May09_MD,Sept09_AM,Sept09_PM,Sept09_MD,May10_AM,May10_PM,May10_MD,Sept10_AM,Sept10_PM,Sept10_MD,May11_AM,May11_PM,May11_MD,Sept11_AM,Sept11_PM,Sept11_MD,May12_AM,May12_PM,May12_MD,Sept12_AM,Sept12_PM,Sept12_MD,May13_AM,May13_PM,May13_MD,Sept13_AM,Sept13_PM,Sept13_MD,May14_AM,May14_PM,May14_MD,Sept14_AM,Sept14_PM,Sept14_MD,May15_AM,May15_PM,May15_MD,Sept15_AM,Sept15_PM,Sept15_MD,May16_AM,May16_PM,May16_MD,Sept16_AM,Sept16_PM,Sept16_MD,May17_AM,May17_PM,May17_MD,Sept17_AM,Sept17_PM,Sept17_MD,May18_AM,May18_PM,May18_MD,Sept18_AM,Sept18_PM,Sept18_MD,May19_AM,May19_PM,May19_MD,Oct20_AM,Oct20_PM,Oct20_MD,May21_AM,May21_PM,May21_MD";

        String[] arr = text.split(",");
        System.out.println();
        System.out.println("lenght: " + arr.length);
        for(String str : arr){
            System.out.print(str + " ");
        }

    }

        
}


