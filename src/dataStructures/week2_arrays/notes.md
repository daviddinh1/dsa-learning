# Week 2 — Singly Linked List

## What We Built
`Node.java` + `SinglyLinkedList.java` — a singly linked list from scratch.

## Key Concepts

**Structure**
- Each `Node` holds a `value` and a `next` pointer (type `Node`, not int)
- The list only tracks `head` — follow `next` pointers to reach everything else
- Last node's `next` is `null`

**Tradeoffs vs Arrays**
- Insert at head: O(1) vs array's O(N) shift
- Search / delete: O(N) — no random access, must traverse from head
- No resizing needed — nodes live anywhere in memory

## Methods Implemented

| Method | Complexity | Notes |
|--------|-----------|-------|
| `insert(value)` | O(N) | Traverses to tail, appends new node |
| `search(value)` | O(N) | Check `current != null` before `current.value` |
| `delete(value)` | O(N) | Track `prev` pointer to rewire around deleted node |
| `reverse()` | O(N) | Three pointers: `prev`, `currNode`, `next` — update `head = prev` at end |
| `printList()` | O(N) | Traverse and print each node's value |

## Common Mistakes
- Setting `next` field type to `int` instead of `Node`
- Checking `current.value` before `current != null` → NullPointerException
- Forgetting `return` after setting head in insert/delete → falls through to while loop
- Not saving `next` before redirecting pointer in `reverse()` — loses rest of list
- Forgetting `head = prev` at end of `reverse()`

## LeetCode Completed
- Reverse Linked List — same three-pointer pattern as reverse(), return prev
- Merge Two Sorted Lists — dummy node + current pointer, advance both lists, attach remainder
- Linked List Cycle — Floyd's fast/slow pointer, check `fast != null && fast.next != null`
- Remove Nth Node From End — dummy node + two pointers with n-step head start, `slow.next = slow.next.next`

## Next Session
- Week 3: Stack & Queue
  - Build Stack (array + linked list versions)
  - Build Queue (circular array + linked list versions)
  - LeetCode: Valid Parentheses, Implement Queue using Stacks, Daily Temperatures, Min Stack
