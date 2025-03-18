# Java Practice Problems

This repository contains solutions to various Java programming problems. Each problem is implemented as a standalone Java program.

## Problem 1: Hotel Room Bookings

### Problem Statement
There are 10 floors in a hotel (numbered from 0 to 9). On each floor, there are 26 rooms, each marked with a capital letter of the English alphabet (from "A" to "Z").

You are presented with a list of reservations, which consists of N three-character strings. The first character of each string is "+" or "−", which describes whether the room was booked or freed. The second and third characters correspond to the number of the floor and letter of the room, respectively. For example, "+4C" means that room C on the 4th floor has just been booked, and "−0G" means that room G on the 0th floor has been freed.

Your task is to compute the number of rooms that are still booked after processing the entire list. You may assume that the list describes a correct sequence of bookings in chronological order; that is, only free rooms can be booked, and only booked rooms can be freed. All rooms are initially free.

### Examples

#### Example 1:
**Input:**  `A = ["+0A", "+9Z", "+4F", "−9Z", "+3G", "+9Z"]`
**Output:** `4`
**Explanation:** Rooms "0A", "4F", "3G", and "9Z" are booked at the end.

#### Example 2:
**Input:** `A = ["+4B", "−4B", "+4B", "−4B"]`
**Output:** `0`
**Explanation:** There are no rooms booked at the end.

#### Example 3:
**Input:** `A = ["+4A", "+5B", "+5A"]`
**Output:** `3`
**Explanation:** Rooms "4A", "5B", and "5A" are booked at the end.

### Constraints
- Each element of array `A` is a string consisting of three characters: "+" or "−", a digit ("0"-"9"), and an uppercase English letter ("A"-"Z").
- The sequence is correct; that is, every booked room was previously free, and every freed room was previously booked.

