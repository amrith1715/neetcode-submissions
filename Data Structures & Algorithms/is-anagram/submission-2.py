class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        a={}
        b={}
        for i in s:
            if i in a:
                a[i]=a[i]+1
            else :
                  a[i]=1
        for i in t:
            if i in b:
                b[i]=b[i]+1
            else :
               b[i]=1
        if a==b:
            return True
        return False