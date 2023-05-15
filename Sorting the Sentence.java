class Solution {
    public String sortSentence(String s) {
        String a[]=s.split(" ");
        String arr[]=new String[a.length];
        HashMap<Integer,String> hm=new HashMap<>();
        for(String st:a)
        {
            Integer i=Integer.parseInt(st.substring(st.length()-1));
            hm.put(i-1,st.substring(0,st.length()-1));
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=hm.get(i);
        }
        String str="";
        for(String st: arr)
        {
            str=str+st+" ";

        }
        return str.trim();
    }
}
