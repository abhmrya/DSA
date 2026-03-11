package DSAExercise.LinkedList.Test2;

public class DeleteBegi extends InsertBeginning{
    public void deletebeg(){
        head = head.Next;
    }
     public static void main(String[] args) {
        DeleteBegi obj = new DeleteBegi();
        
        obj.InsertBeg(12);
        obj.InsertBeg(32);
        obj.InsertBeg(142);
        obj.InsertBeg(54);
        obj.InsertBeg(3);
        obj.InsertBeg(2);

        obj.InsertBetwe(1000,2);
        obj.insertAftVal(1000,1111);
        obj.deletebeg();
        obj.traverse();
     }
}
