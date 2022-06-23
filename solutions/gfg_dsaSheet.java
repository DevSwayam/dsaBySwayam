
class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
   public static String smallestWindow(String s, String p){
   // Your code here
       if(s.length()==0 || p.length()==0 || s.length()<p.length()) // IF S AND P LENGTH ARE 0 OR S IS LESS THAN P
           return "-1";
       HashMap<Character,Integer> h=new HashMap<>(); // TO STORE THE REPEATATION OF CHARACTERS 
       for(int i=0; i<p.length(); i++){ // ITERATE THROUGHT THE ARRAY
           if (!h.containsKey(p.charAt(i))) // IF WE DONT HAVE THE CHARACTER THEN PUT THAT CHARACTER IN HASHMAP AND STORE ITS REPEATAION AS 1
           h.put(p.charAt(i),0);
           h.put(p.charAt(i),h.get(p.charAt(i))+1);
       }
       String res=""; // INTIALISE STRING 
       int n=h.size(); // GET HASHMAP SIZE 
       int start=0,end=0; // TWO POINTERS TO ITERATE 
       int min_length=Integer.MAX_VALUE; // AS WE HAVE TO MINIMISE THE WINDOW LENGTH WE TAKE MAX VALUE OF INT 
       int count=0; // IF WE GET NEW CHARACTER WE WILL INCREASE COUNT 
       char ch[]=s.toCharArray();// CONVERT STRING TO CHAR ARRAY 
       int ind=0; 
       HashMap<Character,Integer> hm=new HashMap<>();
       for(int i=0; i<ch.length; i++){
           if(h.containsKey(ch[i])){
               if(!hm.containsKey(ch[i]))
                   hm.put(ch[i],0);
               hm.put(ch[i],hm.get(ch[i])+1);
               if(h.get(ch[i])==hm.get(ch[i])){
                   count++;
               }
           }
           if(count==n){
               while ( (!hm.containsKey(ch[ind])) || hm.get(ch[ind])>h.get((ch[ind]))){
                   if((!hm.containsKey(ch[ind])) ){
                       ind++;
                   }
                  else if( hm.get(ch[ind])>h.get((ch[ind]))){
                       hm.put(ch[ind],hm.get(ch[ind])-1);
                       ind++;
                   }
               }
               int min=i-ind+1;
               if(min_length>min){
                   start=ind;
                   end=i+1;
                   min_length=min;
               }

           }
       }
       if(min_length==Integer.MAX_VALUE){
           return "-1";
       }
       return s.substring(start,min_length+start);

   }
}
