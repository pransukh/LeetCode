package main



func main(){
    text        := "SANDIP"
    pattern     := "NDI"

    // Arrange
    var tl int = len(text)
    var pl int = len(pattern)

    var hashText = 0;
    var hashPat = 0;
    var i,j = 0,0
    var h = 1;
    var primaryNumber = 101
    var d = 256

    for i=0;i<pl -1;i++{
        h = (h * d) % primaryNumber
    }

    for i = 0;i < pl;i++{
        hashPat = (d * hashPat + pattern[i]) % primaryNumber
        hashText = (d * hashText + text[i]) % primaryNumber
    }

    

}