class Solution:
    def addBinary(self, a: str, b: str) -> str:
        a=a[::-1]
        b=b[::-1]
        n1=0
        for i in range(len(a)):
            n1=n1+((2**i)*int(a[i]))
        n2=0
        for i in range(len(b)):
            n2=n2+((2**i)*int(b[i]))
        s=n1+n2
        s=bin(s)
        s=str(s)
        return(s[2:])
        
            
            
            
            
     