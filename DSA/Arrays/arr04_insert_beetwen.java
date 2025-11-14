public class arr04_insert_beetwen {

    static void insertbn(int[] arr,int element,int size,int index){
        for(int i=size-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=element;
    }

    static void display(int arr[],int size){
        for(int i=1 ;i<=size;i++){
            System.out.println(arr[i]);
        }
    }

    static void jennymethod(int[] arr,int pos,int x){
        try{
            int size=0;
            for(int num : arr){
                
                System.out.println(num);
                if(num != 0){
                    size++;
                    System.out.println(size);
                }
                else {
                    break;
                }
            }
            for(int i = size;i>=pos;i--){
                arr[i]=arr[i-1];

            }
            if(pos<=0 || pos>size+1){
                System.out.println("Position not valid ");
            }else{
            arr[pos-1]=x;
            size++;
            }
            System.out.println(size);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    static void jennymethod2(int[] arr,int x,int pos){
        try{
            int size=arr.length;
            for(int i = size;i>=pos;i--){
                arr[i]=arr[i-1];

            }
            if(pos<=0 || pos>size+1){
                System.out.println("Position not valid ");
            }else{
            arr[pos-1]=x;
            size++;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[10];
        int size=6;
        arr[1]=21;
        arr[2]=4;
        arr[3]=21;
        arr[4]=65;
        arr[5]=32;
        int element = 100;
        int index = 3;
        
        // insertbn(arr,element,size,index);
        // display(arr,size);
        // jennymethod(arr,3,100);   // mestake of for lop 
        jennymethod2(arr, element, index);
        display(arr,size);
    }
}
