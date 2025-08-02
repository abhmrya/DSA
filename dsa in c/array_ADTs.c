#include<stdio.h>
#include<stdlib.h>


struct myArry{
    int  total_size;
    int used_size;
    int *ptr;
};

void createArray(struct myArray * a,int tsize,int usize){
    // (*a).total_size = tsize;
    // (*a).used_size = usize;
    // (*a).ptr=(int*)malloc(tsize*sizeof(int));
                   // or
    a->total_size = tsize;
    a->used_size = usize;
    a->ptr = (int*)malloc(tsize*sizeof(int));
}
void show(struct myArray * a){
    for (int i = 0; i < a->used_size; i++)
    {
        printf("%d\n",(a->ptr)[i]); 
    }
}
void setval(struct myArray*a){
    int n;
    for (int i = 0; i < a->used_size; i++)
    {
        printf("Enter element %d",i);
        scanf("%d",&n);
        (a->ptr)[i]=n;
    }
}
int main(){
    struct myArry marks;
    createArray(&marks,10,2);
    printf("we are running  setval now\n");
    setval(&marks);
    printf("we are rurring show now\n");
    show(&marks);
    return 0;
}