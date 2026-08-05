class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones){
            pq.offer(stone);
        }
        while(pq.size() > 1){
            int max = pq.poll();
            int nextMax = pq.poll();
            if(max == nextMax){
                continue;
            }
            else {
                pq.offer(max - nextMax);
            }
        }
        if(pq.size() == 1)
            return pq.peek();
        return 0;


    }
}
