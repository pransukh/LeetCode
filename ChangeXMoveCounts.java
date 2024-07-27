class ChangeXMoveCounts {
    public int minimumMoves(String str) {
        char arr[] =str.toCharArray();
        int i = 0;int move=0;
        while(i<arr.length){
            if (arr[i] == 'O') i++;
            else {
                move += 1;
                i += 3;
            }
        }
        return move;
    }
}
