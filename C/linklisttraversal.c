#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};

void traversal(struct node*ptr){
    while(ptr!=NULL){
        printf("Element: %d\n",ptr->data);
        //printf("%p\n",&ptr->data);
        ptr=ptr->next;
    }
}
int main(){
    struct node*head;
    struct node*secound;
    struct node*third;
    struct node*fourth;
    head=(struct node*)malloc(sizeof(struct node));
    secound=(struct node*)malloc(sizeof(struct node));
    third=(struct node*)malloc(sizeof(struct node));
    fourth=(struct node*)malloc(sizeof(struct node));

    head->data=7;
    head->next=secound;

    secound ->data=11;
    secound->next=third;

    third->data=41;
    third->next=fourth;

    fourth->data=66;
    fourth->next=NULL;

    traversal(head);
    return 0;
}