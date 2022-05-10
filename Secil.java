public class Secil<T> {

    private  char[] array;
    String str;

    public Secil(String value)
    {
        this.str=value;
        this.array=value.toCharArray();
    }    
    public  char charAt(int index)
    {
        if((0 > index) || (index>= array.length))
        {
            throw new StringIndexOutOfBoundsException(index);
        }        
            return array[index];        
    }
    public  int codePointAt(int index)
    {        
        if((0 > index) || (index>= array.length))
        {
            throw new StringIndexOutOfBoundsException(index);
        }  
        int value = array[index];                
        return  value;
    }
    public  int codePointBefore(int index)
    {        
        if((1 > index) || (index> array.length))
        {            
            throw new StringIndexOutOfBoundsException(index);
        }  
        int value = array[index-1];                
        return  value;
    }
    public int codePointCount(int startindex,int endindex)
    {        
        if((0 > startindex) || (endindex > array.length))
        {
            throw new IndexOutOfBoundsException();
        }        
        return endindex-startindex;
    }        
    public int compareTo(String anotherString) 
    {  
        char[] anotherArray = anotherString.toCharArray();
        int length1 = array.length;  
        int length2 = anotherArray.length;  
        
        int limit = 0;

        if(length1 < length2)
        {
            limit=length1;
        }
        else
        {
            limit=length2;
        }
        
        int i = 0;  
        while (i < limit) {  
            char ch1 = array[i];  
            char ch2 = anotherArray[i];  
            if (ch1 != ch2) 
            {  
                return ch1 - ch2;  
            }  
            i++;  
        }  
        return length1 - length2;
    }
    public int compareToIgnoreCase(String anotherString) 
    {  
        char[] anotherArray = anotherString.toCharArray();
        int length1 = array.length;  
        int length2 = anotherArray.length;  
        
        int limit = 0;
        if(length1 < length2)
        {
            limit=length1;
        }
        else
        {
            limit=length2;
        }
        
        int i = 0;  
        while (i < limit) {  
            int ch1 = array[i];  
            int ch2 = anotherArray[i];  
            if((ch1 >=65 && ch1<=90 ) && (ch2 >=97 && ch2<=122 ))
            {
                ch2-=32;
            }
            else if((ch2 >=65 && ch2<=90 ) && (ch1 >=97 && ch1<=122 ))
            {
                ch2+=32;
            }
            int value = ch1 - ch2;

            if (ch1 != ch2) 
            {  
                return value;               
            }  
            i++;  
        }  
        return length1 - length2;
    }
    public String concat(String str) 
    {    
        int len = str.length();    
        if (len == 0) 
        {    
            return new String(array);
        }    
        else
        {
            return new String(array) + str;
        }
    }
    public boolean contains(String str) 
    {
        boolean contains = false;
        char[] newArray=str.toCharArray();
        if(newArray.length> array.length)
        {
            return contains;
        }        
        for(int i=0; i<array.length;i++)
        {
            int j = 0;
            if(array[i] == newArray[j])            
            {
                while(j < newArray.length)                
                {
                    if(array[i++] == newArray[j++])
                    {
                        contains = true;
                    }
                    else
                    {
                        contains = false;
                        i--;
                    }                            
                }
            }
            if(contains)
            {
                break;
            }
        }
            return contains; 
    }
    public boolean contentEquals(String str)    
    {
        boolean contentEquals = false;
        char[] newArray = str.toCharArray();
        int len1 =array.length;
        int len2 = newArray.length;
        if(len1 == len2)        
        {   
            for(int i=0; i<array.length;i++)
            {                
                if(array[i] == newArray[i])
                {
                    contentEquals = true;
                }
                else
                {
                    contentEquals= false;
                    break;
                }
            }            
        }
        return contentEquals;
    }
    public String copyValueOf(String value,int startIndex,int endIndex)       
    {
        char[] newArray = value.toCharArray();
        String str = "";
        if((0 > startIndex) || (endIndex> array.length))
        {
            throw new StringIndexOutOfBoundsException();
        }
        for(int i=startIndex; i<endIndex; i++)
        {
            str+=newArray[i];
        }
        return str;
    }
    public boolean endsWith(String str) 
    {
        boolean endsWith = false;
        char[] newArray=str.toCharArray();
        for(int i = array.length-1; i>=0;i--)
        {
            int j = newArray.length-1;
            if(array[i] == newArray[j])            
            {
                while(j >= 0)                
                {
                    if(array[i--] == newArray[j--])
                    {
                        endsWith = true;
                    }
                    else
                    {
                        endsWith = false;
                        i++;
                    }                    
                }
            }
            if(endsWith)
            {
                break;
            }
        }
            return endsWith; 
    }
    public boolean equals(String str)    
    {
        boolean equals = false;
        char[] newArray = str.toCharArray();
        int len1 =array.length;
        int len2 = newArray.length;
        if(len1 == len2)        
        {   
            for(int i=0; i<array.length;i++)
            {                
                if(array[i] == newArray[i])
                {
                    equals = true;
                }
                else
                {
                    equals = false;
                    break;
                }
            }            
        }
        return equals;
    }
    public boolean equalsIgnoreCase(String str)    
    {
        boolean equals = false;
        char[] newArray = str.toCharArray();
        if(array.length == newArray.length)        
        {               
            for(int i = 0; i<array.length;i++)
            {          
                int ch1 = array[i];      
                int ch2 = newArray[i];
                if((ch1 >=65 && ch1<=90 ) && (ch2 >=97 && ch2<=122 ))
                {
                    ch2-=32;
                }
                else if((ch2 >=65 && ch2<=90 ) && (ch1 >=97 && ch1<=122 ))
                {
                    ch2+=32;
                }
                if(ch1 ==  ch2)
                {
                    equals = true;
                }
                else
                {
                    equals = false;
                    break;
                }
            }            
        }
        return equals;
    }    
    public String format(String format, T value) 
    {           
        String precision = "";
        String split = "";
        String type = value.getClass().getName();        
        array = type.toCharArray();
        String[] array =new String[1];        
        if(endsWith("Integer"))
        {
            split = "%d";
        }
        else if(endsWith("Double"))
        {            
            int Num = getPrecisonNumber(format.toCharArray());
            if(Num != 0)
            {
                split = "%."+Num+"f";                
                precision = getPrecision(value, Num);
            }
            else
            {
                split = "%f";
            }
        }
        else if(endsWith("Character"))
        {
            split = "%c";            
        }   
        else if(endsWith("String"))
        {
            split = "%s";
        }
        else if(endsWith("Boolean"))
        {
            split = "%b";
        }        
                
        if(containsFormat(format.toCharArray(),split.toCharArray()))
        {
            array = format.split(split);                 
        }        
        else
        {            
            return  "IllegalArgumentException";
        }

        if(precision.length()!=0)
        {
            if(array[0].length()==0)
            {
                return  new String(precision + array[1]);
            }
            else if(array.length==2)
            {
                return  new String(array[0] + precision + array[1]);
            }
            else 
            {
                return  new String(array[0] + precision);
            }            
        }
        else
        {
            if(array[0].length()==0)
            {
                return  new String(value + array[1]);
            }
            else if(array.length==2)
            {
                return  new String(array[0] + value + array[1]);
            }
            else 
            {
                return  new String(array[0] + precision);
            }
        }                
    }
    
    //#region Format
    private int getPrecisonNumber(char[] format) 
    {
        String value ="0";
        for(int i=1; i<format.length;i++)
        {
            if((format[i-1]==46 && format[i]>=49 && format[i]<= 57) || (format[i-1]>=49 && format[i-1]<= 57 && format[i]>=49 && format[i]<= 57))
            {                
                value+=format[i];
            }            
        }
         return Integer.parseInt(value);
    }
    private String getPrecision(T value, int num) 
    {                
        int N = 1;
        int precision1 = 0;
        double precision2 = 0;
        boolean precision=false;
        String[] array = String.valueOf(value).split("[.]");
        
        int len= array[1].length();
        if (len < num)
        {
            num-=len;
            precision = true;
        }
        else
        {
            num++;
        }
        
        for(int i=0; i<num;i++)
        {
            N*=10;
        }
        if(precision)
        {            
            int n = Integer.parseInt(array[1])*N;            
            return new String(array[0]+"."+n);
        }
        else
        {
            precision2 = (double)value*N;
            precision1=(int)precision2;                    
            int last = precision1%10;            
            precision1/=10;            
            N/=10;                
            if(last>=5)
            {
                precision1++;
            }            
            precision2=precision1;
            return String.valueOf(precision2/N);
        }                
    }
    private boolean containsFormat(char[] format, char[] split)
    {
        boolean contains = false;
        for(int i=0; i<format.length;i++)
        {
            if(format[i]==37)
            {
                int j=0;
                while(j<split.length)
                {
                    if(format[i]==split[j])
                    {
                        contains= true;
                    }
                    else
                    {
                        contains= false;
                        break;
                    }
                    i++;
                    j++;
                }
                break;
            }            
        }        
        return contains;        
    }
    //#endregion
    
    public byte[] getBytes()
    {
        byte[] newArray = new byte[array.length];          
        for(int i=0;i<array.length;i++)
        {
            int n=array[i];
            newArray[i]= (byte)n;
        }        
        return newArray;
    }
    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
    {        
        for(int i=srcBegin;i<srcEnd;i++)
        {
            dst[dstBegin]=array[i];
            dstBegin++;
        }        
    }
    public int hashCode()
    {        
        int N = array.length;        
        int hashCode = array[0];
        for(int i=1; i < array.length;i++)
        {
            int ascii=array[i-1];            
            hashCode += ascii * getPower(31, (N-i));
        }
        return hashCode;
    }

    //#region Hashcode
    private int getPower(int base , int power )
    {
        int value = 1;
        while(power!=0)
        {
            value *= base;
            power--;       
        }
        return value;
    }    
    //#endregion
    
    public int indexOf(String str)
    {
        int index = -1;
        for(int i=0 ;i<array.length;i++)
        {
            if(str.charAt(0) == array[i])
            {
                index=i;
                break;
            }
        }   
        return index;
    }    
    public boolean isEmpty()
    {
        boolean isEmplty= false;
        if(array.length==0)
        {
            isEmplty= true;
        }
        return isEmplty;
    }
    public int lastIndexOf(String str)
    {
        char[] strArray=str.toCharArray();
        int index = -1;
        for(int i=0 ;i<array.length;i++)
        {
            if(strArray[0] == array[i])
            {
                index=i;
            }
        }   
        return index;
    }
    public int offsetByCodePoints(CharSequence seq, int index, int codePointOffset)
    {
        if(index + codePointOffset >seq.length())
        {
            throw new IndexOutOfBoundsException();
        }
        return index + codePointOffset;
    }
    
    public boolean regionMatches(int startIndex,String other,int start,int len)
    {
        boolean Matches=false;
        char[] newArray=toCharArray(other);
        if(start<0 || len>newArray.length)        
        {
            return Matches;
        }
        int j=0;
        for(int i=startIndex;i<array.length && j < newArray.length;i++)
        {
            if(array[i]==newArray[j++])
            {
                Matches=true;
            }
            else
            {
                Matches=false;
            }
        }
        return Matches;
    }
    public String replace(char searchChar, char newChar)
    {
        for(int i=0;i<array.length;i++)
        {
            if(searchChar==array[i])
            {
                array[i]=newChar;
            }
        }
        return new String(array);
    }    

    public boolean startsWith(String str)
    {
        char[] strArray=str.toCharArray();
        boolean equal=false;        
        for(int i=0; i<strArray.length;i++)
        {
            if(strArray[i] ==array[i])
            {
                equal=true;
            }
            else
            {
                equal=false;
                break;
            }
        }
        return equal;
    }
    
    public CharSequence subSequence(int start, int end) 
    {
        if(start<0 || end>=array.length)        
        {
            throw new IndexOutOfBoundsException();
        }
        String newStr="";
        CharSequence seq="";
        for(int i=start; i<end;i++)
        {
            newStr+=array[i];
        }
        seq = newStr;        
        return seq;
    }
    public String substring(int start) 
    {
        if(start<0)        
        {
            throw new IndexOutOfBoundsException();
        }
        String newStr="";
        for(int i=start; i<array.length;i++)
        {
            newStr+=array[i];
        }
        return newStr;
    }

    public String substring(int start, int end) 
    {
        if(start<0 || end>=array.length)        
        {
            throw new IndexOutOfBoundsException();
        }
        String newStr="";
        for(int i=start; i<end;i++)
        {
            newStr+=array[i];
        }
        return newStr;
    }

    public char[] toCharArray(String str)
    {
        char[] arr=new char[str.length()];
        for(int i=0; i< arr.length;i++)
        {
            arr[i]=str.charAt(i);
        }
        return arr;
    }
    
    public String toLowerCase()
    {
        for(int i=0; i<array.length;i++)
        {
            if(array[i] >= 65 && array[i] <= 90)
            {
                int N=array[i];
                N+=32;
                array[i]=(char)N;
            }
        }
        return new String(array);
    }

    public String toString(T value)
    {
        String str = new String();
        str+=value;        
        return str;        
    }
    
    public String toUpperCase()
    {
        for(int i=0; i<array.length;i++)
        {
            if(array[i] >= 97 && array[i] <= 122)
            {
                int N=array[i];
                N-=32;
                array[i]=(char)N;
            }
        }
        return new String(array);
    }        

    public String trim()
    {
        String str="";
        int i=0;
        int j=array.length-1;
        int fIndex=-1;
        int lIndex=-1;
        for(; i< array.length;i++,j--)
        {
            if(array[i] !=32 && fIndex == -1)
            {                          
                fIndex=i;
            }
            if(array[j] !=32 && lIndex == -1)
            {               
                 lIndex=j;
            }           
            if(fIndex!=-1 && lIndex!=-1)
            {
                break;
            }
         }
         for(i=fIndex;i<=lIndex;i++)
         {
             str+=array[i];
         }
        return str;
    }

    public String valueOf(T value)
    {        
        String str="";
        str+=value;
        return str;
    }
    
    //#region Regex
private boolean[] setRegexExpArray(boolean[] expRegexArray, char[] regArray)
{
    for(int i=0; i < regArray.length-2;i++)
    {
        if(regArray[i]==97 && regArray[i+1]=='-' && regArray[i+2]== 122)
        {
            expRegexArray[0]=true;
        }
        else if(regArray[i]==65 && regArray[i+1]=='-' && regArray[i+2]== 90)
        {
            expRegexArray[1]=true;
        }
        else if(regArray[i]==48 && regArray[i+1]=='-' && regArray[i+2]== 57)
        {
            expRegexArray[2]=true;
        }
    }                
    return expRegexArray;
}
private boolean[] setRegexCharArray(boolean[] regexExpArray, char[] regArray)
{
        if(regArray[1]=='w')
        {
            regexExpArray[0]=true;
            regexExpArray[1]=true;
            regexExpArray[2]=true;
        }
        else if(regArray[1]=='d')
        {
            regexExpArray[2]=true;
        }
     
        else if(regArray[1]=='s')
        {
            regexExpArray[3]=true;
        }                           
    return  regexExpArray;
}
//#endregion
    
    //#region Split
    public String[] split(String regex)
    {
        char[] regArray=toCharArray(regex);        
        boolean[] regexBoolArray=new boolean[4];
        String[] arr=new String[1];
        if(regArray[0]=='[' && regArray[regArray.length-1]==']')
        {
            regexBoolArray = setRegexExpArray(regexBoolArray, regArray);            
            arr = regexSplitArray(regexBoolArray[0], regexBoolArray[1], regexBoolArray[2], regexBoolArray[3]);
        }
        else if(regArray[0]=='\\')
        {
            regexBoolArray = setRegexCharArray(regexBoolArray, regArray);            
            arr = regexSplitArray(regexBoolArray[0], regexBoolArray[1], regexBoolArray[2], regexBoolArray[3]);
        }      
        else
        {
            arr =  normalSplitArray(regArray);
        }        
        return arr;
    }    
        
    private String[] normalSplitArray(char[] regArray)
    {
        String[] arr=new String[array.length];        
        int arraysize = 0;
        String temp="";        
        boolean split = false;
        for(int i=0; i<array.length;i++)
        {
            if(array[i]==regArray[0])
            {
                String oldStr="";
                split=false;
                int j=0;
                while(j<regArray.length)
                {
                    if(array[i]==regArray[j])
                    {              
                        oldStr+=regArray[j];          
                        split=true;                        
                    }
                    else
                    {
                        oldStr+=array[i];                                  
                        i--;                        
                        split=false;
                    }                                  
                    i++;
                    j++;
                }
                if(split)
                {
                    i--;                    
                    arr[arraysize++]=temp;
                    temp="";
                }
                else
                {
                    temp+=oldStr;
                }
            }
            else
            {
                temp+=array[i];
            }
        }            
        if(temp.length()>0)
        {
            arr[arraysize++]=temp;
        }
        return getSplitedArray(arr,arraysize);
    }
    private String[] regexSplitArray(boolean lCase,boolean uCase ,boolean digit ,boolean space)
    {        
        String[] arr=new String[array.length];
        int i=0;
        int arraysize=0;
        String temp="";
        while(i<array.length)
        {
            if(array[i]>=97 && array[i]<= 122 && !lCase)
            {                     
                temp+=array[i];                                    
            }
            else if(array[i]>=65 && array[i]<= 90 && !uCase)
            {
                temp+=array[i];                                    
            }
            else if(array[i]>=48 && array[i]<= 57 && !digit)
            {                     
                temp+=array[i];                                                    
            }
            else if(array[i]==32 && !space)
            {
                temp+=array[i];
            }                   
            else
            {
                arr[arraysize++]=temp;
                temp="";
            }
            i++;
        }        
        if(temp.length()>0)
        {
            arr[arraysize++]=temp;
        }        
        return getSplitedArray(arr, arraysize);
    }    

    private String[] getSplitedArray(String[] arr,int arraysize)
    {
        String[] newArr = new String[arraysize];
        for(int j=0;j<newArr.length;j++)
        {
            newArr[j]= arr[j];
        }
        return newArr;
    }
    //#endregion

    //#region Matches
    public boolean matches(String regex)    
    {
        char[] regArray=toCharArray(regex);        
        boolean[] regexBoolArray=new boolean[4];
        if(regArray[0]=='[' && regArray[regArray.length-1]==']')
        {
            regexBoolArray = setRegexExpArray(regexBoolArray, regArray);            
        }
        else if(regArray[0]=='\\')
        {
            regexBoolArray = setRegexCharArray(regexBoolArray, regArray);
        }    
        return isMatches(regexBoolArray);
    }
    private boolean isMatches(boolean[] regexBoolArray)
    {
        boolean matches= true;
        for(int i=0; i<array.length-2;i++)
        {
            if(array[i]>=97 && array[i]<= 122)
            {
                if(!regexBoolArray[0])
                {     
                    matches=false;               
                    break;
                }
            }
            else if(array[i]>=65 && array[i]<= 90)
            {
                if(!regexBoolArray[1])
                {     
                    matches=false;                                       
                    break;                
                }
            }
            else if(array[i]>=48 && array[i]<= 57)
            {
                if(!regexBoolArray[2])
                {     
                    matches=false;               
                    break;
                }
            }
            else if(array[i]==32)
            {
                if(!regexBoolArray[3])
                {     
                    matches=false;               
                    break;
                }
            }                   
        }
        return matches;
    }
    //#endregion
    
    //#region Replace First
    public String replaceFirst(String regex, String replacement)    
    {
        char[] regArray=toCharArray(regex);        
        boolean[] regexBoolArray=new boolean[4];
        String value="";        
        if(regArray[0]=='[' && regArray[regArray.length-1]==']')
        {
            regexBoolArray = setRegexExpArray(regexBoolArray, regArray);                                               
            value = regexReplace( value, replacement,true, regexBoolArray[0], regexBoolArray[1], regexBoolArray[2], regexBoolArray[3]);
        }
        else if(regArray[0]=='\\')
        {
            regexBoolArray = setRegexCharArray(regexBoolArray, regArray);
            value = regexReplace( value, replacement,true, regexBoolArray[0], regexBoolArray[1], regexBoolArray[2], regexBoolArray[3]);
        }
        else
        {
            value = normalReplace(regArray, value, replacement,true);
        }
        return value;    
    }
    //#endregion

    //#region Replace All
    public String replaceAll(String regex, String replacement)
    {
        char[] regArray=toCharArray(regex);        
        boolean[] regexBoolArray=new boolean[4];
        String value="";
        if(regArray[0]=='[' && regArray[regArray.length-1]==']')
        {                        
            regexBoolArray = setRegexExpArray(regexBoolArray, regArray);                                               
            value = regexReplace( value, replacement,false, regexBoolArray[0], regexBoolArray[1], regexBoolArray[2], regexBoolArray[3]);
        }
        else if(regArray[0]=='\\')
        {
            regexBoolArray = setRegexCharArray(regexBoolArray, regArray);                               
            value = regexReplace(value, replacement,false, regexBoolArray[0], regexBoolArray[1], regexBoolArray[2], regexBoolArray[3]);
        }
        else
        {
            value = normalReplace(regArray, value, replacement,false);
        }
        return value;    
    }
    //#endregion
    
    //#region Regex Replace
    private String regexReplace(String value, String replacement, boolean firstOccur, boolean lCase,boolean uCase ,boolean digit ,boolean space)
    {        
        boolean replace=true;
        for(int i=0; i<array.length;i++)
        {
            if(array[i]>=65 && array[i]<=90 && uCase && replace)    
            {
                if(firstOccur)
                {
                    replace = false;
                }
                value+=replacement;                
            }
            else if(array[i]>=97 && array[i]<=122 && lCase && replace)    
            {
                if(firstOccur)
                {
                    replace = false;
                }
                value+=replacement;
            }
            else if(array[i]>=48 && array[i]<=57 && digit && replace)       
            {
                if(firstOccur)
                {
                    replace = false;
                }
                value+=replacement;
            }   
            else if(array[i]>=32 && space && replace)    
            {
                if(firstOccur)
                {
                    replace = false;
                }
                value+=replacement;
            }         
            else
            {
                value+=array[i];            
            }                
        }
        return value;
    }
    private String normalReplace(char[] regArray,String value, String replacement, boolean firstOccur)
    {
        boolean match=false;         
        boolean replace = true;                                                    
        for(int i=0; i<array.length;i++)
        {
            if(array[i]==regArray[0] && replace)
            {
                String oldStr="";
                match=false;
                int j=0;
                while(j<regArray.length)
                {
                    if(array[i]==regArray[j])
                    {              
                        oldStr+=regArray[j];          
                        match=true;                        
                    }
                    else
                    {                        
                        oldStr+=array[i];                        
                        match=false;
                        i--;
                    }                                  
                    i++;
                    j++;
                }
                if(match)
                {
                    i--;                    
                    value+=replacement;           
                    if(firstOccur)
                    {
                        replace = false;
                    }
                }
                else
                {
                    value+=oldStr;
                }
            }
            else
            {
                value+=array[i];
            }
        }
        return value;
    }
    //#endregion

}