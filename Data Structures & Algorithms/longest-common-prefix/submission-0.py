class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        length={}
        n=len(strs)
        for i in range(n):
            if strs[i] in length :
                continue 
            else :
                length[i]=len(strs[i])
        minlen=min(list(length.values()))
        while minlen>0:

            prefixes=[]

            for i in range(len(strs)):
                prefixes.append(strs[i][:minlen])
            same=True
            for i in range(1,len(prefixes)):
                if prefixes[i] != prefixes[0]:
                    same=False
                    break
            if same:
                return prefixes[0]
            else :
                minlen-=1
        return ""
