class Rabin_Karp:
    def search(self,text,pattern):
        tl = len(text)
        pl = len(pattern)
        i,j,h,d,hashText,hashPatt,primaryNumber = 0,0,1,256,0,0,101

        for i in range(0,len(pattern) - 1):
            h = (h*d) % primaryNumber

        for i in range(0,len(pattern) - 1):
            hashText = (d * hashText + ord(text[i])) % primaryNumber
            hashPatt = (d * hashPatt + ord(pattern[i])) % primaryNumber

        print(hashText,hashPatt)
        for i in range(0, tl - pl):
            k = 0
            if hashPatt == hashText:

                for j in range(0, pl - 1):
                    if text[ i + j] != pattern[j]:
                        break
                    k = k + 1

                if k == pl-1:
                    print("here")
                    print("Match found at "+str(i))


text = "RED BROWN FOX JUMPED ON ROCK"
pattern= "REDI"

obj = Rabin_Karp()
obj.search(text,pattern)
