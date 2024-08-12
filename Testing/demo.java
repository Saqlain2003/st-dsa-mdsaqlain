package Testing;

import java.util.*;
public class demo
{
        /*public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;
    
            int uniqueCount = 1; // At least one unique element in the array
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[uniqueCount] = nums[i];
                    uniqueCount++;
                }
            }
            return uniqueCount;
        }
    
        public static void main(String[] args) {
            int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
            int uniqueCount = removeDuplicates(nums);
            
            System.out.println("Number of unique elements: " + uniqueCount);
            System.out.print("Array with unique elements: ");
            for (int i = 0; i < uniqueCount; i++) {
                System.out.print(nums[i] + " ");
            }
        }*/
        //public class BinarySearchInsert {
            /*public static int searchInsert(int[] nums, int target) {
                int left = 0;
                int right = nums.length - 1;
        
                while (left <= right) {
                    int mid = left + (right - left) / 2;
        
                    if (nums[mid] == target) {
                        return mid;
                    } else if (nums[mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
        
                return left;
            }
        
            public static void main(String[] args) {
                int[] nums = {1, 3, 5, 6};
                int target = 5;
                System.out.println("Index: " + searchInsert(nums, target));  // Output: 2
        
                target = 2;
                System.out.println("Index: " + searchInsert(nums, target));  // Output: 1
        
                target = 7;
                System.out.println("Index: " + searchInsert(nums, target));  // Output: 4
        
                target = 0;
                System.out.println("Index: " + searchInsert(nums, target));  // Output: 0
            }*/
            
                /*public static void main(String[] args) {
                    int[] digits = {1, 2, 9};
                    plusOne(digits);
                    for (int digit : digits) {
                        System.out.print(digit + " ");
                    }
                }
            
                public static void plusOne(int[] digits) {
                    int n = digits.length;
                    
                    // Traverse the array from the end
                    for (int i = n - 1; i >= 0; i--) {
                        // If the current digit is less than 9, just add one and we're done
                        if (digits[i] < 9) {
                            digits[i]++;
                            return;
                        }
                        // If the current digit is 9, set it to 0 and continue to the next digit
                        digits[i] = 0;
                    }
                    
                    // If we have gone through all digits and they are all zeroes
                    // it means we had a carry over from the most significant digit
                    // We need to create a new array with an extra digit
                    int[] newDigits = new int[n + 1];
                    newDigits[0] = 1; // the most significant digit is now 1
            
                    // Copy the new array back to the original array
                    System.arraycopy(newDigits, 0, digits, 0, newDigits.length);
                }*/
                //import java.util.Scanner;

                //public class BinaryToDecimal {
                    /*public static void main(String[] args) {
                        Scanner scanner = new Scanner(System.in);
                        
                        System.out.print("Enter a binary number: ");
                        long binary = scanner.nextLong();
                        
                        long decimal = 0;
                        int power = 0;
                        
                        while (binary != 0) {
                            long lastDigit = binary % 10;
                            binary = binary / 10;
                            decimal += lastDigit * Math.pow(2, power);
                            power++;
                        }
                        
                        System.out.println("Decimal equivalent: " + decimal);
                        
                        scanner.close();
                    }*/
                //}


                //public class TestQuestion13 {
                    /*public static void main(String[] args) {
                        for (int num1 = 1; num1 <= 99; num1++) {
                            for (int num2 = 1; num2 <= 99; num2++) {
                                int count = 0;
                                for (int i = 0; i < num1; i++) {
                                    if ((3 * (i + 1) + 2) % num2 == 0) {
                                        count++;
                                    }
                                }
                                Set<Integer> results = new HashSet<>();
                                for (int i = 0; i < num1 + count; i++) {
                                    int ans = 3 * (i + 1) + 2;
                                    if (ans % num2 != 0) {
                                        results.add(ans);
                                    }
                                }
                                if (results.size() != num1) {
                                    System.out.println("Failure found for Num1: " + num1 + " and Num2: " + num2);
                                }
                            }
                        }
                    }*/
                //}
                //import java.util.*;

//public class Question13 {
    /*public static void main(String[] args) {
        for (int Num1 = 2; Num1 <= 99; Num1++) {
            for (int Num2 = 2; Num2 <= 99; Num2++) {
                if (isFailing(Num1, Num2)) {
                    System.out.println("Program fails for Num1 = " + Num1 + " and Num2 = " + Num2);
                }
            }
        }
    }

    public static boolean isFailing(int Num1, int Num2) {
        int count = 0;
        for (int i = 0; i < Num1; i++) {
            if ((3 * (i + 1) + 2) % Num2 == 0) {
                count++;
            }
        }

        int validTerms = 0;
        for (int i = 0; i < Num1 + count; i++) {
            if ((3 * (i + 1) + 2) % Num2 != 0) {
                validTerms++;
                if (validTerms == Num1) {
                    return false; // Found enough valid terms
                }
            }
        }

        return true; // Did not find enough valid terms
    }*/
    /*public static int countDigit(String sourceNumber) {
        return sourceNumber.length();
    }

    public static long convertToDecimal(String sourceNumber, int sourceBase) {
        long decimal = 0;
        int length = sourceNumber.length();
        for (int i = 0; i < length; i++) {
            char digitChar = sourceNumber.charAt(length - 1 - i);
            int digit = Character.digit(digitChar, sourceBase);
            decimal += digit * Math.pow(sourceBase, i);
        }
        return decimal;
    }

    public static String convertFromDecimal(long decimal, int destBase) {
        if (decimal == 0) return "0";
        StringBuilder destNumber = new StringBuilder();
        while (decimal > 0) {
            long rem = decimal % destBase;
            destNumber.insert(0, Long.toString(rem, destBase));
            decimal /= destBase;
        }
        return destNumber.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sourceNumber = sc.next();
        int sourceBase = sc.nextInt();
        int destBase = sc.nextInt();
        sc.close();

        long decimal = convertToDecimal(sourceNumber, sourceBase);
        String result = convertFromDecimal(decimal, destBase);
        
        System.out.println(result);
    }*/
    //LeetCode
    public static int[] Check(int[] nums,int target)
    {
        int[] arr=new int[2];
        int low=0,high=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            int temp=target-nums[i];
            while(low<=high)
            {
                int mid=high-(high+low)/2;
                if(nums[mid]==temp)
                {
                    arr[0]=i;
                    arr[1]=mid;
                    break;
                }
                else if(nums[mid]<temp)
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int[] arr=Check(nums,9);
        System.out.println(arr[0]+" "+arr[1]);
    }
}
