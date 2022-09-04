class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
            
        }
        for(int i=0;i<nums2.length;i++)
        {
            int num=nums2[i];
            if(map.containsKey(num)&&map.get(num)!=0)
            {
                 map.put(num,map.get(num)-1);
                list.add(num);
                
            }
        }
        int ans[]=new int[list.size()];
        int i=0;
        for(int num:list)
        {
            ans[i++]=num;
            
        }
        return ans;
        
        
    }
}