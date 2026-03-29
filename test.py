
# def removeDuplicateLetters( s):
#     reverse = s[::-1]
#     print(reverse)
#     dic={}
#     result=''
#     for i in reverse:
#         if i not  in dic:
#             dic[i]=1
#     for key,value in enumerate(dic):
#         print(key,value)
#         result+=value
#     print(result)
#     print(dic)
#     a=result[::-1]
#     print(a)
#     return a
# s = "bcabc"
# print(removeDuplicateLetters( s))

# class Solution {
#     public ListNode reverseKGroup(ListNode head, int k) {
#         Stack<Integer> stack = new Stack<>();
#         ListNode dummy = new ListNode();
#         ListNode newhead = dummy;
#         ListNode temp=head;
#         int num=0;
#         while(temp!=null){
#             if(stack.isEmpty()){
#                 stack.push(temp.val);
#                 num++;
#             }else if(num==k){
#                 while(!stack.isEmpty()){
#                     int a = stack.pop();
#                     dummy.next = new ListNode(a);
#                     dummy = dummy.next;
#                 }
#                 stack.push(temp.val);
#                 num=0;
#                 num++;
#             }else{
#                 stack.push(temp.val);
#                 num++;
#             }
#             temp=temp.next;
#         }
#         if(!stack.isEmpty()){
#             while(!stack.isEmpty()){
#                 int a = stack.pop();
#                 dummy.next = new ListNode(a);
#                 dummy = dummy.next;
#             }
#         }
#         return newhead.next;
#     }
# }