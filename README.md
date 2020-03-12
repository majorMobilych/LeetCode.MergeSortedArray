# LeetCode.MergeSortedArray
Task link: https://leetcode.com/problems/merge-sorted-array/

Methods description from ```SolutionsInterface```:
```jsx
int[] merge(int[] firstArray, int[] secondArray)
```
Methods takes as params two given arrays, variables:
```jsx
int currentFirst = 0, currentSecond = 0
```
are pointers in ```firstArray``` and ```secondArray``` respecrively (meaning, ```currentFirst``` represents current position in ```firstArray```, 
```currentSecond``` represents current position in ```secondArray```). We start from the very first elements of arrays, so they are assigned with zeroes. We pick lowest of ```firstArray[currentFirst]``` and ```secondArray[currentSecond]``` and assign ```merged[currentMerged]``` with it. Then, we assign ```merged[currentMerged]``` with ```firstArray[currentFirst]``` and increase ```currentMerged``` and ```currentFirst```.
  Else, if for some ```currentFirst``` and ```currentSecond```, 
  ```jsx
  firstArray[currentFirst] > secondArray[currentSecond]
  ```
  we assign ```merged[currentMerged]``` with ```secondArray[currentSecond]``` and increase ```currentMerged``` and ```currentSecond```.
