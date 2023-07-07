class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , (a, b)->(a[0]-b[0]));

        LinkedList<int[]> ans = new LinkedList<>();

        for(int[] arr : intervals){
            if(ans.size()==0 || ans.get(ans.size()-1)[1]<arr[0]){
                ans.add(arr);
            }
            else{
                ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1] , arr[1]);
            }
        }

        int[][] ans_arr = new int[ans.size()][2];
        for(int i=0 ; i<ans.size() ; i++){
            ans_arr[i] = ans.get(i);
        }

        return ans_arr;
    }
}