# Week 3 — Stacks & Queues

## Stack

### Key Concepts
- LIFO — Last In, First Out
- Real uses: call stack, undo/redo, bracket matching, backtracking

### Array Stack (`Stacks.java`)
- Fields: `Object[] data`, `int top = -1`
- `top == -1` means empty, `top == data.length - 1` means full
- All operations O(1) — no shifting, just increment/decrement `top`
- Use `isEmpty()` inside `pop` and `peek` rather than checking `data.length`

### Linked List Stack (`StackLinkedList.java`)
- Push and pop from **head** — O(1), no traversal needed
- No capacity limit unlike array version
- Push: `newNode.next = head` → `head = newNode`
- Pop: save `head.value` → `head = head.next`

| Method | Complexity |
|--------|-----------|
| `push` | O(1) |
| `pop` | O(1) |
| `peek` | O(1) |

---

## Queue

### Key Concepts
- FIFO — First In, First Out
- Real uses: task scheduling, BFS, print queues

### Circular Array Queue (`Queue.java`)
- Fields: `int head`, `int tail`, `int size`
- Wrap-around using modulo: `tail = (tail + 1) % data.length`
- `isEmpty()` → `size == 0`, `isFull()` → `size == data.length`
- Modulo reuses freed slots without shifting — acts like a ring

### Linked List Queue (`QueueLinkedList.java`)
- Track both `head` (dequeue end) and `tail` (enqueue end)
- `enqueue` appends to tail — O(1)
- `dequeue` removes from head — O(1)
- Without `tail`, enqueue would require full traversal — O(N)

| Method | Complexity |
|--------|-----------|
| `enqueue` | O(1) |
| `dequeue` | O(1) |

## Monotonic Stack
- A stack that maintains elements in sorted order (increasing or decreasing)
- When a new element violates the order, pop until it doesn't
- Store **indices**, not values — lets you calculate distances between elements
- Classic pattern: "next greater element" — pop when current element is warmer/larger than top

```java
// Next greater element template
Deque<Integer> stack = new ArrayDeque<>();
int[] answer = new int[n]; // defaults to 0
for (int i = 0; i < n; i++) {
    while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
        int idx = stack.pop();
        answer[idx] = i - idx;
    }
    stack.push(i);
}
// remaining indices in stack never found a greater element — stay 0
```

Common problems: Daily Temperatures, Next Greater Element, Trapping Rain Water, Largest Rectangle in Histogram

## ArrayDeque (Java's Modern Alternative)
- `ArrayDeque` can act as both a Stack and a Queue — it's a double-ended queue (deque)
- As a **Stack**: use `push()` / `pop()` / `peek()` — operates on the front
- As a **Queue**: use `offer()` / `poll()` / `peek()` — offer adds to back, poll removes from front
- Prefer over `Stack<T>` (legacy, synchronized) and `LinkedList` (slower, more memory)
- Not thread-safe — faster than `Stack<T>` in single-threaded contexts

```java
Deque<Integer> stack = new ArrayDeque<>();
stack.push(1);      // push to front
stack.pop();        // remove from front

Deque<Integer> queue = new ArrayDeque<>();
queue.offer(1);     // add to back
queue.poll();       // remove from front
```

## Common Mistakes
- Checking `data.length` instead of `size`/`top` for empty checks
- Forgetting `return` after the empty-list branch in enqueue (falls through and duplicates node)
- Using tail end for Stack operations (makes push/pop O(N))
- Forgetting modulo wrap-around in circular queue

## Next Session
- LeetCode Week 3:
  - Easy: Valid Parentheses, Implement Queue using Stacks
  - Medium: Daily Temperatures, Min Stack
