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

## Next Session
- LeetCode Week 2 problems:
  - Easy: Reverse Linked List, Merge Two Sorted Lists
  - Medium: Linked List Cycle, Remove Nth Node From End of List
