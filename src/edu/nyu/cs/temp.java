package edu.nyu.cs;

import java.util.Scanner;


public class temp{
    

    public String[] getLinesFromFile(String filepath) {
		// delete the two lines above... they are placeholder only
		// complete this method
		String fullText = "";
		try{
			Scanner scnr = new Scanner(new File(filepath));
			while (scnr.hasNextLine()){
				String line = scnr.nextLine();
				fullText += line + "\n";
			}
			scnr.close();
		}
		catch (FileNotFoundException e){
			System.out.println("Oh no... can't find the file!");
		}

		String[] lines = fullText.split("\n");
		return lines;
	}


    public String[][] getDataFromLines(String[] lines) {
		// complete this method - DELETE THE EXAMPLE CODE BELOW

		// hint: ultimately, you want this function to return data structured something like the following (you can structure your array differently if you prefer)
		// in this example, the geospatial Point data (latitude and longitude), which is one field in the original CSV file, has been broken up into two fields... you would be wise to do this too.
		/*String[][] allLines = { 
			// the first two values are the latitude and longitude... these were a single field in the original CSV file
			{"-73.90459140730678","40.87919896648574","Bronx","1","1","Broadway","West 231st Street","Naples Terrace","N","1189","4094","2508","734","2646","2939","802","4015","2631","1125","4310","3420","1001","3475","2832","991","4262","2469","1010","3609","3128","863","4119","2217","997","4440","2687","1328","3820","2428","1288","3328","3365","1268","4315","2276","1210","4710","3825","1206","4590","3008","1220","4384","2641","1450","4646","2996","1788","4980","3033","1204","4520","2999","1246","4531","2686","1309","3642","2830","1916","5893","2776","1111","4044","2731","1271","4502","2899","1708","4464","2967","","","","486","2843","1754","630","3262","4710"},
			{"-73.92188432870218","40.82662794123294","Bronx","2","2","East 161st Street","Grand Concourse","Sheridan Avenue","Y","1511","3184","1971","1855","3754","1183","1136","2638","1522","1939","3283","1383","1351","3111","1304","1227","3137","2762","2077","3283","1409","1007","3069","1477","1734","3333","1772","2051","3525","1752","1233","1875","1912","2113","4099","1970","2278","4215","2288","2071","3890","1832","2206","4363","2315","1949","4435","2388","2318","4589","2483","2005","4790","2512","2053","4721","2311","2109","5485","2548","1848","4920","2143","2389","5952","2832","1749","5148","2156","2006","4723","1604","1702","4347","1576","780","1892","1287","1405","2097","8410"},
			{"-73.92785197149036","40.80034506063933","Harlem River Bridges","113","113","Triborough Bridge (Manhattan span)","midpoint","","N","17","35","34","11","44","24","30","44","16","30","200","23","37","44","23","20","174","66","12","39","55","36","205","64","10","45","11","7","119","39","26","21","49","6","33","15","12","42","16","13","31","40","14","32","10","21","42","20","19","36","14","17","40","28","10","18","8","21","43","21","7","19","5","16","38","24","6","14","4","12","15","6","","","","","","","23","52","6437"},
			{"-73.93686603590555","40.78611224350854","Harlem River Bridges","114","114","Wards Island Bridge","midpoint","","N","57","207","71","63","186","149","45","203","113","80","190","120","33","213","324","43","151","173","37","169","674","77","205","913","32","66","70","62","189","936","78","249","439","102","460","569","191","455","435","92","514","594","164","527","312","123","458","564","189","539","312","117","424","581","160","484","300","159","490","587","169","493","312","178","519","608","187","543","351","213","490","263","","","","","","","237","405","6353"}
		};
		return allLines; */
		
		String[][] allLines = new String[lines.length][90];


		for(int i = 0; i < lines.length; i++){
			allLines[i] = lines[i].split(", ");
		}

		return allLines;
	}


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


