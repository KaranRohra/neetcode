class MinStack {
    Map<Integer, Integer> map;
    Deque<Integer> stack;
    Queue<Integer> minQue;

    public MinStack() {
        stack = new ArrayDeque<>();
        map = new HashMap<>();
        minQue = new PriorityQueue<>();
    }
    
    public void push(int val) {
        map.put(val, map.getOrDefault(val, 0) + 1);
        stack.push(val);
        minQue.add(val);
    }
    
    public void pop() {
        int val = stack.pop();
        int cnt = map.get(val);
        map.put(val, cnt - 1);
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        while(map.get(minQue.peek()) == 0) {
            minQue.poll();
        }
        return minQue.peek();
    }
}
