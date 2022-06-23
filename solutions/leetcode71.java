class Solution {
    public String simplifyPath(String path) {
      Stack<String> s = new Stack<>(); // as if we enter in looping directories we have to exit in FIFO order so stack will be best optio 
      StringBuilder res = new StringBuilder(); // will store the results in stringbuilder 
      String[] p = path.split("/");  // will split given string were ever we get / 
      for(int i = 0 ; i<p.length ; i++){ // ierate through each string 
          if(!s.empty() && p[i].equals("..")){ // if string is empty or it have .. means get out from directory 
             s.pop(); // we will pop the string 
          }
           else if(!p[i].equals("") && !p[i].equals(".") && !p[i].equals("..")){ // if string which we are going to push dosent have anything or it has single dot means stay in that directory ot it has .. dots means get out from that directory we will not push that part in string 
             s.push(p[i]);   // push in string                
           }
      }
        if(s.empty()){
            return "/"; // if staCK IS empty then return only /
        }
        while(!s.empty()){ // if its not empty then 
            res.insert(0,s.pop()).insert(0,"/"); // pop ot last element we entered and before popping insert / 
        }
        return res.toString(); // return stringbuilder in form of string 
    }
}