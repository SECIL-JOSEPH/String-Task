import java.util.*;

public class Program{
    
    public static void main(String[] args) {
         
        Secil obj=new Secil("Secil Joseph");     
        System.out.println(obj.charAt(2));
        
        System.out.println(obj.codePointAt(0));
        
        System.out.println(obj.codePointBefore(1));
        
        System.out.println(obj.codePointCount(0,5));
        
        System.out.println(obj.compareTo("Secil"));
        
        System.out.println(obj.compareToIgnoreCase("SeCiL"));
        
        System.out.println(obj.concat(" love zoho"));
            
        System.out.println(obj.contains("Joseph"));
        
        System.out.println(obj.contentEquals("Secil Joseph"));

        System.out.println(obj.copyValueOf("Secil", 0, 1));

        System.out.println(obj.endsWith("Joseph"));
        
        System.out.println(obj.equals("Secil Joseph"));
        
        System.out.println(obj.equalsIgnoreCase("SeCiL JOsEpH"));

        System.out.println(obj.format("%.5f Hi buddy", 23.566));        
        
        System.out.println(Arrays.toString(obj.getBytes()));         
        
        char[] dummy=new char[10];        
        obj.getChars(1, 7, dummy, 0);
        System.out.println(dummy);
        
        obj=new Secil("Hello");        
        System.out.println(obj.hashCode());
        
        System.out.println(obj.indexOf("l"));
        
        obj=new Secil("");        
        System.out.println(obj.isEmpty());
        obj=new Secil("secils");        
        System.out.println(obj.lastIndexOf("s"));
        
        CharSequence seq="secil Joseph";
        System.out.println(obj.offsetByCodePoints(seq, 2, 5));

        obj=new Secil("Hi buddy seciljoseph");
        System.out.println(obj.regionMatches(9, "secil", 0, 5));

        System.out.println(obj.replace('s', 'c'));
                        
        System.out.println(obj.startsWith("secii"));
        
        System.out.println(obj.subSequence(0, 3));
        
        System.out.println(obj.substring(0, 4));
        
        System.out.println(obj.toCharArray("Hello buddy"));

        System.out.println(obj.toLowerCase());
                        
        System.out.println(obj.toString(233));

        System.out.println(obj.toUpperCase());

        System.out.println(obj.trim());

        System.out.println(obj.valueOf(23.23));

        obj=new Secil("Hello I am secil I am from Trichy");        
        
        System.out.println(obj.replaceFirst("am", "was"));

        System.out.println(obj.replaceAll("am", "was"));
        
        obj=new Secil("Secil");        

        System.out.println(obj.matches("[a-z]"));


        obj=new Secil("Secil avcBBB hgHHH");        
        String[] ar= obj.split("[a-z]");
        System.out.println(Arrays.toString(ar));

        obj=new Secil("aravind");        
         ar= obj.split("aravind");
        System.out.println(Arrays.toString(ar));
        
        String[] arr="aravind".split("aravind");
        System.out.println(Arrays.toString(arr));
    }
}