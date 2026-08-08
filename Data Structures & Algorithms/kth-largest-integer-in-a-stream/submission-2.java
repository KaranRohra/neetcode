class KthLargest {
    private int k;
    private Queue<Integer> minHeap, maxHeap;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for(int num: nums) {
            maxHeap.add(num);
        }
        while(!maxHeap.isEmpty() && k-- > 0) {
            minHeap.add(maxHeap.poll());
        }
    }
    
    public int add(int val) {
        if(minHeap.size() < this.k) {
            minHeap.add(val);
        }
        else if(val > minHeap.peek()) {
            maxHeap.add(minHeap.poll());
            minHeap.add(val);
        } else {
            maxHeap.add(val);
        }
        return minHeap.peek();
    }
}
