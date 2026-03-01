# Week 1 — Dynamic Arrays

## Session 1 Summary

### What We Built
`DynamicArrays.java` — a dynamic array from scratch in Java.

### Key Concepts

**size vs capacity**
- `size` = number of elements currently stored
- `capacity` = total slots allocated in the backing array
- Resize when `size == capacity` (before adding the next element)

**Amortized O(1) for add()**
- Doubling capacity on resize means total copy operations across all resizes = 1 + 2 + 4 + ... + N ≈ 2N
- Spread over N adds = ~2 operations per add on average = O(1) amortized
- Growing by +1 instead of doubling would make it O(N) amortized — doubling is critical

**Why Object[] not int[]**
- Using `Object[]` allows the array to store any type
- Cast when retrieving elements

### Methods Implemented

| Method | Complexity | Notes |
|--------|-----------|-------|
| `add(Object)` | O(1) amortized | Triggers resize when full |
| `get(int)` | O(1) | Bounds check against `size`, not `capacity` |
| `set(int, Object)` | O(1) | Replaces existing element — use `add` to insert new ones |
| `remove(int)` | O(N) | Shifts all elements after index left by 1 |
| `resize()` | O(N) | Doubles capacity, copies all elements to new array |

### Common Mistakes
- Using `set` to add elements (throws IndexOutOfBoundsException — size is 0 initially)
- Checking bounds against `capacity` instead of `size` in get/set/remove
- Updating `capacity` before creating the new array in `resize()`
- Not nulling out `data[size]` after remove (memory leak with objects)

### Next Session
- LeetCode Week 1 problems:
  - Easy: Two Sum, Remove Duplicates from Sorted Array
  - Medium: Product of Array Except Self
