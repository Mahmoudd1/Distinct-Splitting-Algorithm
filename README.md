# Distinct-Splitting-Algorithm

This is a Java solution for the Distinct Split algorithm, which aims to find the maximum number of distinct characters that can be obtained by splitting a given string into two non-empty parts.
## Problem Description
Given a string str, the goal is to split it into two non-empty parts such that the number of distinct characters in both parts is maximized. 
we need to determine the maximum number of distinct characters that can be achieved by performing the split.
## Solution
The solution provided uses a sliding window approach to split the string and counts the number of distinct characters in each part.

## Time Complexity
The time complexity of this solution is O(n), where n is the length of the input string str. The solution iterates over the string twice, once from the beginning and once from the end.

## Space Complexity
The space complexity is O(1) since the solution uses two arrays of constant size 26 to store the frequency of characters.

## Example
Consider the following example:

Input: str = "abacabad"

The algorithm will split the string into two parts: "abac" and "abad". The maximum number of distinct characters is 6.
