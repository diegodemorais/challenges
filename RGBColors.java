
import java.util.Scanner;

public class RGBColors {
    static String parseColor(String rgbFormat, String color) {
        String result = null;
        if (rgbFormat.equals("RGB888")){
            if (color.substring(0,2).equals("0x")){
                int r = Integer.parseInt(color.substring(2,4), 16);
                int g = Integer.parseInt(color.substring(4,6), 16);
                int b = Integer.parseInt(color.substring(6,8), 16);
                result = r + " "+ g + " " + b;
            } else {
                String[] rgb = color.split(" ");
                String r = Integer.toHexString(Integer.parseInt(rgb[0])).toUpperCase();
                String g = Integer.toHexString(Integer.parseInt(rgb[1])).toUpperCase();
                String b = Integer.toHexString(Integer.parseInt(rgb[2])).toUpperCase();
               
                if (r.length()==1) r = "0"+r;
                if (g.length()==1) g = "0"+g;
                if (b.length()==1) b = "0"+b;
               
                result = "0x"+r+g+b;
            }
        } else  if (rgbFormat.equals("RGB565")){
            if (color.substring(0,2).equals("0x")){
                String p1 = Integer.toBinaryString(Integer.parseInt(color.substring(2,4), 16));
                String p2 = Integer.toBinaryString(Integer.parseInt(color.substring(4,6), 16));
                while (p1.length()<8) p1="0"+p1;
                while (p2.length()<8) p2="0"+p2;
                String rgb=""+p1+p2;

                String r = Integer.toString(Integer.parseInt(rgb.substring(0,5),2)).toUpperCase();
                String g = Integer.toString(Integer.parseInt(rgb.substring(5,11),2)).toUpperCase();
                String b = Integer.toString(Integer.parseInt(rgb.substring(11,16),2)).toUpperCase();               
                
                result = r + " "+ g + " " + b;
            } else {
               
                String[] rgb = color.split(" ");
                rgb[0] = Integer.toBinaryString(Integer.parseInt(rgb[0]));
                rgb[1] = Integer.toBinaryString(Integer.parseInt(rgb[1]));
                rgb[2] = Integer.toBinaryString(Integer.parseInt(rgb[2]));
                
                while (rgb[0].length()<5) rgb[0]="0"+rgb[0];
                while (rgb[1].length()<6) rgb[1]="0"+rgb[1];
                while (rgb[2].length()<5) rgb[2]="0"+rgb[2];
                String rgbStr = ""+rgb[0]+rgb[1]+rgb[2];
                
                String p1 = Integer.toHexString(Integer.parseInt(rgbStr.substring(0,8),2)).toUpperCase();
                String p2 = Integer.toHexString(Integer.parseInt(rgbStr.substring(8,16),2)).toUpperCase();
                
                if (p1.length()==1) p1 = "0"+p1;
                if (p2.length()==1) p2 = "0"+p2;
               
                result = "0x"+p1+p2;
            }        
           
        }
       
        return result;
    } 
   
   
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            String rgbFormat = sc.nextLine();
//            if (rgbFormat.equals("RGB888") || rgbFormat.equals("RGB888")) {
//                break;
//            }
//        String color = sc.nextLine();
////        String rgbFormat = "RGB888";
        String rgbFormat = "RGB565";
        String color= "31 63 0";       
////        String color= "255 255 255";    
////        String color= "0 0 0";
////        String color= "0xFFFFFF";
//        String color= "0xFFE0";
        String result = parseColor(rgbFormat, color);
        System.out.println(result);
    }
}
