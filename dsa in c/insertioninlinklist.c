#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node*next;
};
void linklisttraversal(struct node*ptr){
    while(ptr!=NULL){
        printf("Enter the element:%d\n",ptr->data);
        ptr=ptr->next;
    }
}
struct node*inseratfirst(struct node*head,int data){
    struct node*ptr=(struct node*)malloc(sizeof(struct node));
    ptr->next=head;
    ptr->data=data;
    return ptr;
}
int main(){
    struct node*head;
    struct node*first;
    struct node*second;
    struct node*third;
    struct node*forth;
    struct node*five;

    head=(struct node*)malloc(sizeof(struct node));
    first=(struct node*)malloc(sizeof(struct node));
    second=(struct node*)malloc(sizeof(struct node));
    third=(struct node*)malloc(sizeof(struct node));
    forth=(struct node*)malloc(sizeof(struct node));
    five=(struct node*)malloc(sizeof(struct node));

    head->data=1;
    head->next=first;

    first->data=3;
    first->next=second;

    second->data=5;
    second->next=third;

    third->data=7;
    third->next=forth;

    forth->data=9;
    forth->next=five;

    five->data=11;
    five->next=NULL;
    linklisttraversal(head);
    head=inseratfirst(head,0);
    linklisttraversal(head);
    return 0;

}
