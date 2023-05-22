class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {

        
        for(int t=0;t<score.length;t++)
        {
            int index=t;
            for(int i=t+1;i<score.length;i++)
            {
                    if(score[i][k]>score[index][k]){
                        index=i;
                        
                    }
            }
            swap(score,t,index);
        }
        
    return score;
    }
    public void swap(int[][]score,int t,int index)
    {
        int []temp=score[t];
        score[t]=score[index];
        score[index]=temp;

        
    }
}
