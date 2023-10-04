public class BitManipulation {

    public static void main(String args[]){
        System.out.println(5 & 6);  // Binary AND (&)

        System.out.println(5 | 6); // Binary OR (|)

        System.out.println(5 ^ 6);  // Binary XOR (^)

        System.out.println(~5);  // Binary one's complement (~)

        System.out.println(5<<2);  // Binary left shift (<<)

        System.out.println(6>>1);  // Binary Right shift (>>)

        checkEvenAndOdd(5);
        checkEvenAndOdd(10);
        checkEvenAndOdd(19);

       System.out.println("get bit: "+ getIthBit(10, 2));

       System.out.println("set bit: "+setIthBit(10, 2));

       System.out.println("clear bit: "+clearIthBit(10, 1));

       System.out.println("update bit: "+updateIthBit(10, 2,1));

        System.out.println("clear last bit: "+clearLastBit(15, 2));

        System.out.println("clear Range of bits: "+clearRangeOfBits(10, 2,4));

        System.out.println("Power of two: "+ isPowerOfTwo(8));

        System.out.println("Count set Bits: "+ countSetBits(15));

        System.out.println("Fast Exponentiation: "+ fastExponentiation(2, 10));

    }

    public static int fastExponentiation(int a,int n){
        int ans = 1;
        while(n>0){
            if((n&1)!=0){
                ans*=a;
            }
            a*=a;
            n=n>>1;
        }
        return ans;
    }
 
    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }

    public static int clearRangeOfBits(int n , int i,int j){
        int a = ((~0)<<(j+1));
        int b= (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;

    }

    public static int clearLastBit(int n , int i){
        int bitMask = (~0<<i); 
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i ,int newBit){
        // if(newBit==0){
        //    return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n, i);
        // }
        n=clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n|bitMask;
    }

    public static int clearIthBit(int n , int i){
        int bitMask=~(1<<i);
       return (n & bitMask);
    }

    public static int setIthBit(int n , int i){  // set the i th bit in the exiting number
        int bitMask = 1<<i;
       return (n | bitMask);
    }


    public static int getIthBit(int n,int i){  // get the i th bit from given bits

        int bitMask = 1<<i;

        if((n&bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }

    }


    public static void checkEvenAndOdd(int n){  // check the given binary number is even or odd

        int bitMask = 1;

        if((n & bitMask) == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }

    }

    
}
