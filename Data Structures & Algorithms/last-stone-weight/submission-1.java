class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for(int s: stones) {
            maxHeap.add(s);
        }
        while(maxHeap.size() > 1) {
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            if(x < y) {
                maxHeap.add(y - x);
            } else if(x > y) {
                maxHeap.add(x - y);
            }
        }

        return maxHeap.peek() != null ? maxHeap.poll() : 0;
    }
}
