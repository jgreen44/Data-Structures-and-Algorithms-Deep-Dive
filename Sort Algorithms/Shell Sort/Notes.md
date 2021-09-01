## Shell Sort:


1. Variation of Insertion Sort
2. Insertion sort chooses which element to insert using a gap of 1
3. Shell Sort starts out using a larger gap value
4. As the algorithm runs, the gap is reduced
5. Goal is to reduce the amount of shifting required
6. In-place algorithm
7. Difficult to nail down the time complexity because it will depend on the gap.
   1. Worst Case: O(N<sup>2</sup>), but it can perform much better than that
8. Doesn't require as much shifting as Insertion Sort, so it usually performs better
9. Unstable algorithm